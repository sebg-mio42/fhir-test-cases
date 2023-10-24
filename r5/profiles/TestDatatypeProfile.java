package org.hl7.fhir.r5.profiles;

import java.util.List;
import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Date;


import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.profilemodel.PEBuilder;
import org.hl7.fhir.r5.profilemodel.PEInstance;
import org.hl7.fhir.r5.profilemodel.PEBuilder.PEElementPropertiesPolicy;
import org.hl7.fhir.r5.profilemodel.gen.PEGeneratedBase;
import org.hl7.fhir.r5.profilemodel.gen.Min;
import org.hl7.fhir.r5.profilemodel.gen.Max;
import org.hl7.fhir.r5.profilemodel.gen.Label;
import org.hl7.fhir.r5.profilemodel.gen.Doco;
import org.hl7.fhir.r5.profilemodel.gen.BindingStrength;
import org.hl7.fhir.r5.profilemodel.gen.ValueSet;
import org.hl7.fhir.r5.profilemodel.gen.MustSupport;
import org.hl7.fhir.r5.profilemodel.gen.Definition;


// Generated by the HAPI Java Profile Generator, {date}

/**
 * Test CodeableConcept Profile.
 *
 */
public class TestDatatypeProfile extends PEGeneratedBase {

  private static final String CANONICAL_URL = "http://hl7.org/fhir/test/StructureDefinition/pe-profile2|0.1";

  @Min("1") @Max("2") @Doco("Code defined by a terminology system")
  @Definition("A reference to a code defined by a terminology system.")
  private List<Coding> codings = new ArrayList<>();// @NotNull  // Code defined by a terminology system

  @Min("1") @Max("1") @Doco("Code defined by a terminology system")
  @Definition("A reference to a code defined by a terminology system.")
  private Coding snomedct;// @NotNull  // Code defined by a terminology system

  @Min("0") @Max("1") @Doco("Code defined by a terminology system")
  @Definition("A reference to a code defined by a terminology system.")
  private Coding loinc;  // Code defined by a terminology system

  @Min("1") @Max("1") @Doco("Plain text representation of the concept")
  @Definition("A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.")
  private String text;// @NotNull  // Plain text representation of the concept


  /**
   * Parameter-less constructor.
   *
   */
  public TestDatatypeProfile() {
  }

  /**
   * Used when loading other models 
   *
   */
  public static TestDatatypeProfile fromSource(PEInstance source) {
    TestDatatypeProfile theThing = new TestDatatypeProfile();
    theThing.workerContext = source.getContext();
    theThing.load(source);
    return theThing;
  }

  public void load(PEInstance src) {
    clear();
    for (PEInstance item : src.children("coding")) {
      codings.add((Coding) item.asDataType());
    }
    if (src.hasChild("snomedct")) {
      snomedct = (Coding) src.child("snomedct").asDataType();
    }
    if (src.hasChild("loinc")) {
      loinc = (Coding) src.child("loinc").asDataType();
    }
    if (src.hasChild("text")) {
      text = ((StringType) src.child("text").asDataType()).getValue();
    }

  }

  public void save(PEInstance tgt, boolean nulls) {
    tgt.clear("coding");
    for (Coding item : codings) {
      tgt.addChild("coding", item);
    }
    tgt.clear("snomedct");
    if (snomedct != null) {
      tgt.addChild("snomedct", snomedct);
    }
    tgt.clear("loinc");
    if (loinc != null) {
      tgt.addChild("loinc", loinc);
    }
    tgt.clear("text");
    if (text != null) {
      tgt.makeChild("text").data().setProperty("value", new StringType(text));
    }

  }

  /**
   * Test CodeableConcept Profile.
   *
   */
  public List<Coding> getCodings() {
    if (codings == null) { codings = new ArrayList<>(); }
    return codings;
  }

  public boolean hasCodings() {
    return codings != null && !codings.isEmpty();
  }

  public Coding addCoding() {
    Coding theThing = new Coding();
    getCodings().add(theThing);
    return theThing;
  }

  public boolean hasCoding(Coding item) {
    return hasCodings() && codings.contains(item);
  }

  public void removeCoding(Coding item) {
    if (hasCoding(item)) {
      codings.remove(item);
    }
  }


  /**
   * Test CodeableConcept Profile.
   *
   */
  public Coding getSnomedct() {
    if (snomedct == null) { snomedct = new Coding(); }
    return snomedct;
  }

  public TestDatatypeProfile setSnomedct(Coding value) {
    this.snomedct = value;
    return this;
  }
  public boolean hasSnomedct() {
    return snomedct != null;
  }

  /**
   * Test CodeableConcept Profile.
   *
   */
  public Coding getLoinc() {
    if (loinc == null) { loinc = new Coding(); }
    return loinc;
  }

  public TestDatatypeProfile setLoinc(Coding value) {
    this.loinc = value;
    return this;
  }
  public boolean hasLoinc() {
    return loinc != null;
  }

  /**
   * Test CodeableConcept Profile.
   *
   */
  public String getText() {
    return text;
  }

  public TestDatatypeProfile setText(String value) {
    this.text = value;
    return this;
  }

  public boolean hasText() {
    return text != null;
  }



  public void clear() {
    codings.clear();
    snomedct = null;
    loinc = null;
    text = null;

  }

}
