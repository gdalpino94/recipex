/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-10 at 08:51:47 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Model definition for MainAddPrescriptionMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainAddPrescriptionMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("active_ingredient") @com.google.api.client.json.JsonString
  private java.lang.Long activeIngredient;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long caregiver;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dose;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pil;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long quantity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recipe;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String units;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getActiveIngredient() {
    return activeIngredient;
  }

  /**
   * @param activeIngredient activeIngredient or {@code null} for none
   */
  public MainAddPrescriptionMessage setActiveIngredient(java.lang.Long activeIngredient) {
    this.activeIngredient = activeIngredient;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCaregiver() {
    return caregiver;
  }

  /**
   * @param caregiver caregiver or {@code null} for none
   */
  public MainAddPrescriptionMessage setCaregiver(java.lang.Long caregiver) {
    this.caregiver = caregiver;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDose() {
    return dose;
  }

  /**
   * @param dose dose or {@code null} for none
   */
  public MainAddPrescriptionMessage setDose(java.lang.Long dose) {
    this.dose = dose;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public MainAddPrescriptionMessage setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public MainAddPrescriptionMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPil() {
    return pil;
  }

  /**
   * @param pil pil or {@code null} for none
   */
  public MainAddPrescriptionMessage setPil(java.lang.String pil) {
    this.pil = pil;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * @param quantity quantity or {@code null} for none
   */
  public MainAddPrescriptionMessage setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecipe() {
    return recipe;
  }

  /**
   * @param recipe recipe or {@code null} for none
   */
  public MainAddPrescriptionMessage setRecipe(java.lang.Boolean recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnits() {
    return units;
  }

  /**
   * @param units units or {@code null} for none
   */
  public MainAddPrescriptionMessage setUnits(java.lang.String units) {
    this.units = units;
    return this;
  }

  @Override
  public MainAddPrescriptionMessage set(String fieldName, Object value) {
    return (MainAddPrescriptionMessage) super.set(fieldName, value);
  }

  @Override
  public MainAddPrescriptionMessage clone() {
    return (MainAddPrescriptionMessage) super.clone();
  }

}
