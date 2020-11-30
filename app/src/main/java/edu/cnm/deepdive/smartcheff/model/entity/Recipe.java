package edu.cnm.deepdive.smartcheff.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

@SuppressWarnings("NotNullFieldNotInitialized")
@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = User.class,
            parentColumns = "user_id",
            childColumns = "user_id",
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE)
    },
    indices = {
        @Index(value = {"external_key"}, unique = true)
    }
)
public class Recipe {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "recipe_id")
  private Long id;

  @NonNull
  @ColumnInfo(name = "user_id", index = true)
  private Long userid;

  @ColumnInfo(name = "external_key")
  @Expose
  @SerializedName("id")
  private long externalKey;


  private String instructions;


  @NonNull
  @ColumnInfo(name = "name")
  @Expose
  @SerializedName("title")
  private String name;

  @Expose
  private String image;

  @ColumnInfo(name = "prep_time")
  private int prepTime;


  @ColumnInfo(name = "skill_level")
  private int skillLevel;


  @ColumnInfo(name = "serving_quantity")
  private int servingQuantity;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @NonNull
  public Long getUserid() {
    return userid;
  }

  public void setUserid(@NonNull Long userid) {
    this.userid = userid;
  }

  public long getExternalKey() {
    return externalKey;
  }

  public void setExternalKey(long externalKey) {
    this.externalKey = externalKey;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @NonNull
  public String getName() {
    return name;
  }

  public void setName(@NonNull String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public int getPrepTime() {
    return prepTime;
  }

  public void setPrepTime(int prepTime) {
    this.prepTime = prepTime;
  }

  public int getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(int skillLevel) {
    this.skillLevel = skillLevel;
  }

  public int getServingQuantity() {
    return servingQuantity;
  }

  public void setServingQuantity(int servingQuantity) {
    this.servingQuantity = servingQuantity;
  }
}
