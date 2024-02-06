package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PollParameters
 */

public class PollParameters {

  private Integer maxEvents;

  private Boolean returnImmediately;

  @Valid
  private List<String> acks;

  public PollParameters maxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * An OPTIONAL integer value indicating the maximum number of unacknowledged SETs to be returned. The SET Transmitter SHOULD NOT send more SETs than the specified maximum. If more than the maximum number of SETs are available, the SET Transmitter determines which to return first; the oldest SETs available MAY be returned first, or another selection algorithm MAY be used, such as prioritizing SETs in some manner that makes sense for the use case. A value of 0 MAY be used by SET Recipients that would like to perform an acknowledge-only request. This enables the Recipient to use separate HTTP requests for acknowledgement and reception of SETs. If this parameter is omitted, no limit is placed on the number of SETs to be returned.
   * @return maxEvents
  */
  
  @Schema(name = "maxEvents", description = "An OPTIONAL integer value indicating the maximum number of unacknowledged SETs to be returned. The SET Transmitter SHOULD NOT send more SETs than the specified maximum. If more than the maximum number of SETs are available, the SET Transmitter determines which to return first; the oldest SETs available MAY be returned first, or another selection algorithm MAY be used, such as prioritizing SETs in some manner that makes sense for the use case. A value of 0 MAY be used by SET Recipients that would like to perform an acknowledge-only request. This enables the Recipient to use separate HTTP requests for acknowledgement and reception of SETs. If this parameter is omitted, no limit is placed on the number of SETs to be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxEvents")
  public Integer getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
  }

  public PollParameters returnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
    return this;
  }

  /**
   * An OPTIONAL JSON boolean value that indicates the SET Transmitter SHOULD return an immediate response even if no results are available (short polling). The default value is false, which indicates the request is to be treated as an HTTP long poll, per [Section 2](https://www.rfc-editor.org/rfc/rfc6202#section-2) of [RFC6202](https://www.rfc-editor.org/rfc/rfc8936.html#RFC6202). The timeout for the request is part of the configuration between the participants, which is out of scope of this specification.
   * @return returnImmediately
  */
  
  @Schema(name = "returnImmediately", description = "An OPTIONAL JSON boolean value that indicates the SET Transmitter SHOULD return an immediate response even if no results are available (short polling). The default value is false, which indicates the request is to be treated as an HTTP long poll, per [Section 2](https://www.rfc-editor.org/rfc/rfc6202#section-2) of [RFC6202](https://www.rfc-editor.org/rfc/rfc8936.html#RFC6202). The timeout for the request is part of the configuration between the participants, which is out of scope of this specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnImmediately")
  public Boolean getReturnImmediately() {
    return returnImmediately;
  }

  public void setReturnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
  }

  public PollParameters acks(List<String> acks) {
    this.acks = acks;
    return this;
  }

  public PollParameters addAcksItem(String acksItem) {
    if (this.acks == null) {
      this.acks = new ArrayList<>();
    }
    this.acks.add(acksItem);
    return this;
  }

  /**
   * List of event JTIs that the receiver is acknowledging. The Transmitter can stop keeping track of these.
   * @return acks
  */
  
  @Schema(name = "acks", description = "List of event JTIs that the receiver is acknowledging. The Transmitter can stop keeping track of these.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acks")
  public List<String> getAcks() {
    return acks;
  }

  public void setAcks(List<String> acks) {
    this.acks = acks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollParameters pollParameters = (PollParameters) o;
    return Objects.equals(this.maxEvents, pollParameters.maxEvents) &&
        Objects.equals(this.returnImmediately, pollParameters.returnImmediately) &&
        Objects.equals(this.acks, pollParameters.acks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxEvents, returnImmediately, acks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollParameters {\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    returnImmediately: ").append(toIndentedString(returnImmediately)).append("\n");
    sb.append("    acks: ").append(toIndentedString(acks)).append("\n");
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

