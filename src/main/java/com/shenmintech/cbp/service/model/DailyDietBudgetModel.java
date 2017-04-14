package com.shenmintech.cbp.service.model;

import com.shenmintech.base.bean.BaseRetBean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DailyDietBudgetModel extends BaseRetBean {

  public int surplusBudgetToday;
  public int minBreakfastRecommendations;
  public int maxBreakfastRecommendations;
  public int minLunchRecommendations;
  public int maxLunchRecommendations;
  public int minDinnerRecommendations;
  public int maxDinnerRecommendations;
  public int minSnackRecommendations;
  public int maxSnackRecommendations;
}
