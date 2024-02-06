package org.openapitools.api;


import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.itnaf.model.Audience;
import org.itnaf.repository.AudienceRepository;
import org.openapitools.model.RegisterParameters;
import org.openapitools.model.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;


import java.net.URI;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
public class RegisterApiController implements RegisterApi {
    @Autowired
    AudienceRepository audienceRepository;

    private final NativeWebRequest request;

    @Autowired
    public RegisterApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<RegisterResponse> register(
        @Parameter(name = "RegisterParameters", description = "", required = true) @Valid @RequestBody RegisterParameters registerParameters
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    URI audienceURI = registerParameters.getAudience();
                    Audience audience = audienceRepository.findByName(audienceURI.toString());
                    if (audience == null) {
                        UUID uuid = UUID.randomUUID();
                        audience = new Audience(uuid.toString(), audienceURI.toString(), uuid.toString());
                        audienceRepository.save(audience);
                        String exampleString = "{ \"token\" : \"" + uuid.toString() + "\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }

                    String token = audience.getToken();
                    String exampleString = "{ \"token\" : \"" + token + "\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


}
