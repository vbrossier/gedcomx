package org.gedcomx.types;

import org.codehaus.enunciate.qname.XmlQNameEnum;
import org.codehaus.enunciate.qname.XmlUnknownQNameEnumValue;

import javax.xml.bind.annotation.XmlTransient;

@XmlQNameEnum
public enum CharacteristicType {

  age,
  caste_name,
  clan_name,
  count_of_children,
  count_of_marriages,
  died_before_eight,
  dwelling,
  gedcom_uuid,
  household,
  marital_status,
  namesake,
  national_id,
  national_origin,
  not_accountable,
  occupation,
  never_had_children,
  never_married,
  physical_description,
  possessions,
  race,
  religious_affiliation,
  scholastic_achievement,
  social_security_number,
  stillborn,
  title_of_nobility,
  tribe_name,
  twin,
  common_law_marriage,
  universal_id,
  currently_spouses,
  number_of_children,
  batch_number,
  @XmlUnknownQNameEnumValue
  other;

  @XmlTransient
  public static final class Person {
    private Person(){}

    public static final CharacteristicType age = CharacteristicType.age;
    public static final CharacteristicType caste_name = CharacteristicType.caste_name;
    public static final CharacteristicType clan_name = CharacteristicType.clan_name;
    public static final CharacteristicType count_of_children = CharacteristicType.count_of_children;
    public static final CharacteristicType count_of_marriages = CharacteristicType.count_of_marriages;
    public static final CharacteristicType died_before_eight = CharacteristicType.died_before_eight;
    public static final CharacteristicType dwelling = CharacteristicType.dwelling;
    public static final CharacteristicType gedcom_uuid = CharacteristicType.gedcom_uuid;
    public static final CharacteristicType household = CharacteristicType.household;
    public static final CharacteristicType marital_status = CharacteristicType.marital_status;
    public static final CharacteristicType namesake = CharacteristicType.namesake;
    public static final CharacteristicType national_id = CharacteristicType.national_id;
    public static final CharacteristicType national_origin = CharacteristicType.national_origin;
    public static final CharacteristicType not_accountable = CharacteristicType.not_accountable;
    public static final CharacteristicType occupation = CharacteristicType.occupation;
    public static final CharacteristicType never_had_children = CharacteristicType.never_had_children;
    public static final CharacteristicType never_married = CharacteristicType.never_married;
    public static final CharacteristicType physical_description = CharacteristicType.physical_description;
    public static final CharacteristicType possessions = CharacteristicType.possessions;
    public static final CharacteristicType race = CharacteristicType.race;
    public static final CharacteristicType religious_affiliation = CharacteristicType.religious_affiliation;
    public static final CharacteristicType scholastic_achievement = CharacteristicType.scholastic_achievement;
    public static final CharacteristicType social_security_number = CharacteristicType.social_security_number;
    public static final CharacteristicType stillborn = CharacteristicType.stillborn;
    public static final CharacteristicType title_of_nobility = CharacteristicType.title_of_nobility;
    public static final CharacteristicType tribe_name = CharacteristicType.tribe_name;
    public static final CharacteristicType twin = CharacteristicType.twin;
  }

  @XmlTransient
  public static final class Couple {
    private Couple() {}

    public static final CharacteristicType common_law_marriage = CharacteristicType.common_law_marriage;
    public static final CharacteristicType universal_id = CharacteristicType.universal_id;
    public static final CharacteristicType currently_spouses = CharacteristicType.currently_spouses;
    public static final CharacteristicType never_had_children = CharacteristicType.never_had_children;
    public static final CharacteristicType never_married = CharacteristicType.never_married;
    public static final CharacteristicType number_of_children = CharacteristicType.number_of_children;
  }

  @XmlTransient
  public static final class Record {
    private Record() {}

    public static final CharacteristicType batch_number = CharacteristicType.batch_number;
    public static final CharacteristicType household = CharacteristicType.household;
  }

}