/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import jakarta.validation.Valid;
import org.openapitools.model.TriggerEventParameters;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Validated
@Tag(name = "OutOfBand", description = "Endpoints that are NOT a part of the [Open ID Spec](https://openid.net/specs/openid-sse-framework-1_0.html), but that exist for convenience within this demo.")
public interface TriggerEventApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /trigger-event : Request the transmitter to create a SSE event of certain type and subject and send it to the (streams)receivers that care about the subject.
     * This endpoint is not part of the spec, but rather a quick-and-dirty way to  test out sample security events other than verification.
     *
     * @param triggerEventParameters  (required)
     * @return On successful creation of an event, it will be sent out as per SSE spec (i.e. push or poll). (status code 200)
     */
    @Operation(
        operationId = "triggerEvent",
        summary = "Request the transmitter to create a SSE event of certain type and subject and send it to the (streams)receivers that care about the subject.",
        description = "This endpoint is not part of the spec, but rather a quick-and-dirty way to  test out sample security events other than verification.",
        tags = { "OutOfBand" },
        responses = {
            @ApiResponse(responseCode = "200", description = "On successful creation of an event, it will be sent out as per SSE spec (i.e. push or poll).")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/trigger-event",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> triggerEvent(
        @Parameter(name = "TriggerEventParameters", description = "", required = true) @Valid @RequestBody TriggerEventParameters triggerEventParameters
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
