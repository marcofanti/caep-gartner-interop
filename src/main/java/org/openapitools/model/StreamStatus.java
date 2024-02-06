package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * StreamStatus
 */

public class StreamStatus {

  private String status;

  private Subject subject;

  public StreamStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StreamStatus(String status) {
    this.status = status;
  }

  public StreamStatus status(String status) {
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

  public StreamStatus subject(Subject subject) {
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
    StreamStatus streamStatus = (StreamStatus) o;
    return Objects.equals(this.status, streamStatus.status) &&
        Objects.equals(this.subject, streamStatus.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamStatus {\n");
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

