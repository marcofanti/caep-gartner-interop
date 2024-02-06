package org.openapitools.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;


import java.util.Optional;

@Controller
@RequestMapping("${openapi.streamManagementAPIForOpenIDSharedSecurityEvents.base-path:}")
public class AddSubjectApiController implements AddSubjectApi {

    private final NativeWebRequest request;

    @Autowired
    public AddSubjectApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
