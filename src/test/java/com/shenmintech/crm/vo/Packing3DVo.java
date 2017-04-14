package com.shenmintech.crm.vo;

import lombok.Data;

@Data
public class Packing3DVo {
	public Long productId;
	public int[] array;//长宽高
	public int volume;//体积
	public int sum;
}
