package com.shenmintech.cbp.controller.bean.req;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查找食物出参")
public class FindFoodResBean extends BaseRetBean {

  @ApiModelProperty(value = "状态", required = true)
  private String status;

  @ApiModelProperty(value = "消息", required = true)
  private String message;

  @ApiModelProperty(value = "食物信息", required = true)
  private FoodDetail result;

  @ApiModel("查找食物明细出参")
  public class FoodDetail {

    @ApiModelProperty(value = "食物单位", required = true)
    private String foodUnitType;


    @ApiModelProperty(value = "食物单位重量", required = true)
    private int foodUnitWeight;


    @ApiModelProperty(value = "食物营养", required = true)
    private List<FoodUnitNutris> foodUnitNutris;


    @ApiModelProperty(value = "食物测量信息", required = true)
    private List<FoodMeasures> foodMeasures;



    @ApiModelProperty(value = "食物单图片地址", required = true)
    private String foodPicPath;


    @ApiModelProperty(value = "食物名称", required = true)
    private String foodName;


    public String getFoodUnitType() {
      return foodUnitType;
    }


    public void setFoodUnitType(String foodUnitType) {
      this.foodUnitType = foodUnitType;
    }


    public int getFoodUnitWeight() {
      return foodUnitWeight;
    }


    public void setFoodUnitWeight(int foodUnitWeight) {
      this.foodUnitWeight = foodUnitWeight;
    }


    public List<FoodUnitNutris> getFoodUnitNutris() {
      return foodUnitNutris;
    }


    public void setFoodUnitNutris(List<FoodUnitNutris> foodUnitNutris) {
      this.foodUnitNutris = foodUnitNutris;
    }


    public List<FoodMeasures> getFoodMeasures() {
      return foodMeasures;
    }


    public void setFoodMeasures(List<FoodMeasures> foodMeasures) {
      this.foodMeasures = foodMeasures;
    }


    public String getFoodPicPath() {
      return foodPicPath;
    }


    public void setFoodPicPath(String foodPicPath) {
      this.foodPicPath = foodPicPath;
    }


    public String getFoodName() {
      return foodName;
    }


    public void setFoodName(String foodName) {
      this.foodName = foodName;
    }


    public class FoodMeasures {
      @ApiModelProperty(value = "食物单位名称", required = true)
      private String measureName;

      @ApiModelProperty(value = "食物重量", required = true)
      private int measureWeight;

      public String getMeasureName() {
        return measureName;
      }

      public void setMeasureName(String measureName) {
        this.measureName = measureName;
      }

      public int getMeasureWeight() {
        return measureWeight;
      }

      public void setMeasureWeight(int measureWeight) {
        this.measureWeight = measureWeight;
      }



    }


    public class FoodUnitNutris {
      @ApiModelProperty(value = "食物名称", required = true)
      private String nutriWeight;

      @ApiModelProperty(value = "食物名称", required = true)
      private int nutriUnitType;

      @ApiModelProperty(value = "食物名称", required = true)
      private int nutriID;

      public String getNutriWeight() {
        return nutriWeight;
      }

      public void setNutriWeight(String nutriWeight) {
        this.nutriWeight = nutriWeight;
      }

      public int getNutriUnitType() {
        return nutriUnitType;
      }

      public void setNutriUnitType(int nutriUnitType) {
        this.nutriUnitType = nutriUnitType;
      }

      public int getNutriID() {
        return nutriID;
      }

      public void setNutriID(int nutriID) {
        this.nutriID = nutriID;
      }



    }
  }



  public String getStatus() {
    return status;
  }



  public void setStatus(String status) {
    this.status = status;
  }



  public String getMessage() {
    return message;
  }



  public void setMessage(String message) {
    this.message = message;
  }


  public FoodDetail getResult() {
    return result;
  }



  public void setResult(FoodDetail result) {
    this.result = result;
  }
}
