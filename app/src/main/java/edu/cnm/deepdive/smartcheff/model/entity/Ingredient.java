package edu.cnm.deepdive.smartcheff.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;


@Entity(foreignKeys = {@ForeignKey(entity = User.class,parentColumns = "user_id",childColumns = "user_id",
onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class Ingredient {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "ingredient_id")
  private long id;

  @ColumnInfo(name = "quantity_available")
  private int quantityAvailable;

  @ColumnInfo(name = "upc")
  private String upc;

  @ColumnInfo(name = "user_id",index = true)
  private long userid;

  @ColumnInfo(name = "name")
  private String name;

}