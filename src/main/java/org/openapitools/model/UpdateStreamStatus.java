package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UpdateStreamStatus
 */

public class UpdateStreamStatus {

  private String reason;

  private String status;

  private Subject subject;

  public UpdateStreamStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateStreamStatus(String status) {
    this.status = status;
  }

  public UpdateStreamStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * OPTIONAL. A short text description that explains the reason for the change.
   * @return reason
  */
  
  @Schema(name = "reason", example = "Disabled by administrator action.", description = "OPTIONAL. A short text description that explains the reason for the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public UpdateStreamStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * REQUIRED. The status of the stream. Values can be one of:  enabled:   The Transmitter MUST transmit events over the stream,   according to the stream’s configured delivery method.  paused:   The Transmitter MUST NOT transmit events over the stream.   The transmitter will hold any events it would have transmitted while paused,   and SHOULD transmit them when the stream’s status becomes enabled.   If a Transmitter holds successive events that affect the same Subject Principal,   then the Transmitter MUST make sure that those events are transmitted in   the order of time that they were generated OR the Transmitter MUST send   only the last events that do not require the previous events affecting   the same Subject Principal to be processed by the Receiver,   because the previous events are either cancelled by the later events or   the previous events are outdated.  disabled:   The Transmitter MUST NOT transmit events over the stream,   and will not hold any events for later transmission.
   * @return status
  */
  //@NotNull
  @Schema(name = "status", example = "disabled", description = "REQUIRED. The status of the stream. Values can be one of:  enabled:   The Transmitter MUST transmit events over the stream,   according to the stream’s configured delivery method.  paused:   The Transmitter MUST NOT transmit events over the stream.   The transmitter will hold any events it would have transmitted while paused,   and SHOULD transmit them when the stream’s status becomes enabled.   If a Transmitter holds successive events that affect the same Subject Principal,   then the Transmitter MUST make sure that those events are transmitted in   the order of time that they were generated OR the Transmitter MUST send   only the last events that do not require the previous events affecting   the same Subject Principal to be processed by the Receiver,   because the previous events are either cancelled by the later events or   the previous events are outdated.  disabled:   The Transmitter MUST NOT transmit events over the stream,   and will not hold any events for later transmission.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UpdateStreamStatus subject(Subject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @Valid
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStreamStatus updateStreamStatus = (UpdateStreamStatus) o;
    return Objects.equals(this.reason, updateStreamStatus.reason) &&
        Objects.equals(this.status, updateStreamStatus.status) &&
        Objects.equals(this.subject, updateStreamStatus.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, status, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStreamStatus {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

