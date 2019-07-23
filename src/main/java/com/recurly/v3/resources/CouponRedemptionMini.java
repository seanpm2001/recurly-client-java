/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class CouponRedemptionMini extends Resource {

  @SerializedName("coupon")
  @Expose
  private CouponMini coupon;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("discounted")
  @Expose
  private String discounted;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("state")
  @Expose
  private String state;

  public CouponMini getCoupon() {
    return this.coupon;
  }

  public void setCoupon(final CouponMini coupon) {
    this.coupon = coupon;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getDiscounted() {
    return this.discounted;
  }

  public void setDiscounted(final String discounted) {
    this.discounted = discounted;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public String getState() {
    return this.state;
  }

  public void setState(final String state) {
    this.state = state;
  }
}
