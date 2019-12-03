
package com.narek;

 final class AutoValue_AutoValuePerson extends AutoValuePerson {

  private final String name;
  private final int age;

  AutoValue_AutoValuePerson(
      String name,
      int age) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.age = age;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "AutoValuePerson{"
        + "name=" + name + ", "
        + "age=" + age
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoValuePerson) {
      AutoValuePerson that = (AutoValuePerson) o;
      return (this.name.equals(that.getName()))
           && (this.age == that.getAge());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.age;
    return h;
  }

}
