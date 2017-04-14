package com.shenmintech.cbp.controller.bean.req;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("建议食物出参")
public class SuggestionFoodResBean extends BaseRetBean {

  @ApiModelProperty(value = "状态", required = true)
  private String status;

  @ApiModelProperty(value = "消息", required = true)
  private String message;

  @ApiModelProperty(value = "食物信息", required = true)
  private List<FoodSuggestion> result;



  public List<FoodSuggestion> getResult() {
    return result;
  }



  public void setResult(List<FoodSuggestion> result) {
    this.result = result;
  }


  @ApiModel("建议食物明细出参")
  public class FoodSuggestion {

    @ApiModelProperty(value = "食物图片路径", required = true)
    private String foodPicPath;


    @ApiModelProperty(value = "食物卡路里", required = true)
    private int unitCalory;


    @ApiModelProperty(value = "食物名称", required = true)
    private String foodName;


    @ApiModelProperty(value = "食物id", required = true)
    private String fingerprint;


    public int getUnitCalory() {
      return unitCalory;
    }

    public void setUnitCalory(int unitCalory) {
      this.unitCalory = unitCalory;
    }

    public String getFoodName() {
      return foodName;
    }

    public void setFoodName(String foodName) {
      this.foodName = foodName;
    }

    public String getFingerprint() {
      return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
    }

    public String getFoodPicPath() {
      return foodPicPath;
    }

    public void setFoodPicPath(String foodPicPath) {
      this.foodPicPath = foodPicPath;
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



}
