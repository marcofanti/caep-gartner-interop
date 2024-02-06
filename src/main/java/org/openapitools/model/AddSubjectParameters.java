package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AddSubjectParameters
 */

public class AddSubjectParameters {

  private AddSubjectParametersSubject subject;

  private Boolean verified;

  public AddSubjectParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddSubjectParameters(AddSubjectParametersSubject subject) {
    this.subject = subject;
  }

  public AddSubjectParameters subject(AddSubjectParametersSubject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  //@NotNull @Valid
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subject")
  public AddSubjectParametersSubject getSubject() {
    return subject;
  }

  public void setSubject(AddSubjectParametersSubject subject) {
    this.subject = subject;
  }

  public AddSubjectParameters verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * OPTIONAL. A boolean value; when true, it indicates that the Event Receiver has verified the Subject claim. When false, it indicates that the Event Receiver has not verified the Subject claim. If omitted, Event Transmitters SHOULD assume that the subject has been verified.
   * @return verified
  */
  
  @Schema(name = "verified", description = "OPTIONAL. A boolean value; when true, it indicates that the Event Receiver has verified the Subject claim. When false, it indicates that the Event Receiver has not verified the Subject claim. If omitted, Event Transmitters SHOULD assume that the subject has been verified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSubjectParameters addSubjectParameters = (AddSubjectParameters) o;
    return Objects.equals(this.subject, addSubjectParameters.subject) &&
        Objects.equals(this.verified, addSubjectParameters.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubjectParameters {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

