package org.openapitools.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

import jakarta.validation.Valid;

/**
 * AddSubjectParametersSubject
 */


@JsonTypeName("AddSubjectParameters_subject")
public class AddSubjectParametersSubject implements Subject {

  public AddSubjectParametersSubject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddSubjectParametersSubject(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId, List<@Valid SimpleSubject> identifiers) {
//    super(format, identifiers, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public AddSubjectParametersSubject format(String format) {
//    super.format(format);
    return this;
  }

  public AddSubjectParametersSubject identifiers(List<@Valid SimpleSubject> identifiers) {
//    super.identifiers(identifiers);
    return this;
  }

  public AddSubjectParametersSubject addIdentifiersItem(SimpleSubject identifiersItem) {
//    super.addIdentifiersItem(identifiersItem);
    return this;
  }

  public AddSubjectParametersSubject application(ComplexSubjectApplication application) {
//    super.application(application);
    return this;
  }

  public AddSubjectParametersSubject device(ComplexSubjectDevice device) {
//    super.device(device);
    return this;
  }

  public AddSubjectParametersSubject group(ComplexSubjectGroup group) {
//    super.group(group);
    return this;
  }

  public AddSubjectParametersSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
//    super.orgUnit(orgUnit);
    return this;
  }

  public AddSubjectParametersSubject session(ComplexSubjectSession session) {
    //  super.session(session);
    return this;
  }

  public AddSubjectParametersSubject tenant(ComplexSubjectTenant tenant) {
    //  super.tenant(tenant);
    return this;
  }

  public AddSubjectParametersSubject user(ComplexSubjectUser user) {
    //  super.user(user);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubjectParametersSubject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  @Override
  public String getFormat() {
    return null;
  }
}

