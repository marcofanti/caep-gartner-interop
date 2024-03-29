/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.TransmitterConfiguration;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Validated
@Tag(name = "StreamManagement", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#management) Stream Management endpoints provided by an Event Transmitter so that Event Transmitters may configure Event Streams.")
public interface WellKnownApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /.well-known/sse-configuration : Transmitter Configuration Request (without path)
     * Return Transmitter Configuration information.
     *
     * @return A set of Claims about the Transmitter&#39;s configuration, including all necessary endpoints and public key location information  (status code 200)
     */
    @Operation(
        operationId = "wellKnownSsfConfigurationGet",
        summary = "Transmitter Configuration Request (without path)",
        description = "Return Transmitter Configuration information.",
        tags = { "StreamManagement" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A set of Claims about the Transmitter's configuration, including all necessary endpoints and public key location information ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TransmitterConfiguration.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/.well-known/sse-configuration",
        produces = { "application/json" }
    )
    
    default ResponseEntity<TransmitterConfiguration> wellKnownSsfConfigurationGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"delivery_methods_supported\" : [ \"https://schemas.openid.net/secevent/risc/delivery-method/push\", \"https://schemas.openid.net/secevent/risc/delivery-method/poll\" ], \"configuration_endpoint\" : \"https://transmitter.most-secure.com/stream\", \"critical_subject_members\" : [ \"tenant\", \"user\" ], \"add_subject_endpoint\" : \"https://transmitter.most-secure.com/add-subject\", \"remove_subject_endpoint\" : \"https://transmitter.most-secure.com/remove-subject\", \"status_endpoint\" : \"https://transmitter.most-secure.com/status\", \"jwks_uri\" : \"https://transmitter.most-secure.com/jwks.json\", \"issuer\" : \"https://most-secure.com\", \"verification_endpoint\" : \"https://transmitter.most-secure.com/verification\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /.well-known/sse-configuration/{issuer} : Transmitter Configuration Request (with path)
     * Return Transmitter Configuration information (with support for specifying an issuer).
     *
     * @param issuer Using path components enables supporting multiple issuers per host. This is required in some multi-tenant hosting configurations. This use of .well-known is for supporting multiple issuers per host; unlike its use in [RFC5785](https://openid.net/specs/openid-sse-framework-1_0.html#RFC5785), it does not provide general information about the host.  (required)
     * @return A set of Claims about the Transmitter&#39;s configuration, including all necessary endpoints and public key location information.  (status code 200)
     */
    @Operation(
        operationId = "wellKnownSsfConfigurationIssuerGet",
        summary = "Transmitter Configuration Request (with path)",
        description = "Return Transmitter Configuration information (with support for specifying an issuer).",
        tags = { "StreamManagement" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A set of Claims about the Transmitter's configuration, including all necessary endpoints and public key location information. ", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TransmitterConfiguration.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/.well-known/sse-configuration/{issuer}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<TransmitterConfiguration> wellKnownSsfConfigurationIssuerGet(
        @Parameter(name = "issuer", description = "Using path components enables supporting multiple issuers per host. This is required in some multi-tenant hosting configurations. This use of .well-known is for supporting multiple issuers per host; unlike its use in [RFC5785](https://openid.net/specs/openid-sse-framework-1_0.html#RFC5785), it does not provide general information about the host. ", required = true, in = ParameterIn.PATH) @PathVariable("issuer") String issuer
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"delivery_methods_supported\" : [ \"https://schemas.openid.net/secevent/risc/delivery-method/push\", \"https://schemas.openid.net/secevent/risc/delivery-method/poll\" ], \"configuration_endpoint\" : \"https://transmitter.most-secure.com/stream\", \"critical_subject_members\" : [ \"tenant\", \"user\" ], \"add_subject_endpoint\" : \"https://transmitter.most-secure.com/add-subject\", \"remove_subject_endpoint\" : \"https://transmitter.most-secure.com/remove-subject\", \"status_endpoint\" : \"https://transmitter.most-secure.com/status\", \"jwks_uri\" : \"https://transmitter.most-secure.com/jwks.json\", \"issuer\" : \"https://most-secure.com\", \"verification_endpoint\" : \"https://transmitter.most-secure.com/verification\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
