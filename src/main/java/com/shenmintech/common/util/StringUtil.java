package com.shenmintech.common.util;


import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by suoer@ajyaguru.com on 15/6/29.
 */

/**
 * 字符串工具类
 *
 * @author max
 */
@Slf4j
public class StringUtil extends org.apache.commons.lang3.StringUtils {

  public static String blank = "";

  public StringUtil() {
    super();
  }

  public static Object ifNull(Object obj) {
    if (null == obj) return "";
    return obj;
  }

  /**
   * 使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
   *
   * @param content 字符串对象
   * @param charset 编码方式
   * @return 所得 byte 数组
   */
  public static byte[] getContentBytes(String content, String charset) {
    if (charset == null || "".equals(charset)) {
      return content.getBytes();
    }

    try {
      return content.getBytes(charset);
    } catch (UnsupportedEncodingException ex) {
      throw new IllegalArgumentException("Not support:" + charset, ex);
    }
  }

  public static String getDateTimeString() {
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    String result = dateFormat.format(now);
    return result;
  }

  public static String getDateTimeSplitString() {
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String result = dateFormat.format(now);
    return result;

  }

  public static String getDateString() {
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    String result = dateFormat.format(now);
    return result;

  }

  public static String getDateTimeString(String pattern) {
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat(pattern);// yyyyMMddHHmmssSSS
    String result = dateFormat.format(now);
    return result;

  }

  public static String getRequestParam(HttpServletRequest request, String paramName) {
    String value = request.getParameter(paramName);
    if (value != null && !"".equals(value.trim())) {
      return value;
    }
    return "";

  }

  /**
   * 判断是否为手机号码
   * 
   * @param mobile
   * @return
   */
  public static boolean isMobile(String mobile) {
    if (mobile == null) {
      return false;
    }
    Pattern pattern =
        Pattern.compile("^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-9])|(14[0-9]))\\d{8}$");
    return pattern.matcher(mobile).matches();
  }

  /**
   * 判断是否包含空格
   * 
   * @param
   * @return
   */
  public static boolean inclSpace(String space) {
    if (space == null) {
      return false;
    }
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
    return pattern.matcher(space).matches();
  }

  /**
   * 判断是否为身份证
   * 
   * @param identity
   * @return
   */
  public static boolean isIdentity(String identity) {
    if (!org.springframework.util.StringUtils.hasText(identity)) return false;
    String str = identity.toUpperCase();
    Pattern pattern = Pattern.compile("([0-9]{17}([0-9]|X))|([0-9]{15})", Pattern.CASE_INSENSITIVE);
    return pattern.matcher(str).matches();
  }

  /**
   * 判断是否为邮箱地址
   * 
   * @param email
   * @return
   */
  public static boolean isEmail(String email) {
    Pattern pattern =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    return pattern.matcher(email).matches();
  }

  public static boolean checkDate(String date) {
    if (date == null) {
      return false;
    }
    Pattern pattern = Pattern.compile(
        "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$");
    return pattern.matcher(date).matches();
  }

  /**
   * 判断日期格式是否正确( yy-mm-dd )
   * 
   * @param date
   * @return
   */
  public static boolean checkDat(String date) {
    if (date == null) {
      return false;
    }
    Pattern pattern = Pattern.compile(
        "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))");
    return pattern.matcher(date).matches();
  }

  public static boolean check(Date date) {
    if (date == null) {
      return false;
    }
    // Pattern result =
    // Pattern.compile("^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))
    // (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$");
    return false;
  }

  public static String IDCardValidate(String idCard) {
    StringBuffer errorMessage = new StringBuffer();
    String[] ValCodeArr = {"1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2"};
    String[] Wi =
        {"7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10", "5", "8", "4", "2"};
    String Ai = "";
    if (!StringUtils.hasText(idCard)) {
      return "身份证为空";
    } else {
      idCard = idCard.toLowerCase();
    }
    // ================ 号码的长度 15位或18位 ================
    if (idCard.length() != 15 && idCard.length() != 18) {
      errorMessage.append("身份证号码长度应该为15位或18位。");
      return errorMessage.toString();
    }
    // =======================(end)========================

    // ================ 数字 除最后一位都为数字 ================
    if (idCard.length() == 18) {
      Ai = idCard.substring(0, 17);
    } else if (idCard.length() == 15) {
      Ai = idCard.substring(0, 6) + "19" + idCard.substring(6, 15);
    }
    if (isNumeric(Ai) == false) {
      errorMessage.append("身份证15位号码都应为数字 ; 18位号码除最后一位外，都应为数字。");
      return errorMessage.toString();
    }
    // =======================(end)========================

    // ================ 出生年月是否有效 ================
    String strYear = Ai.substring(6, 10);// 年份
    String strMonth = Ai.substring(10, 12);// 月份
    String strDay = Ai.substring(12, 14);// 月份
    if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {
      errorMessage.append("身份证生日无效。");
      return errorMessage.toString();
    }
    GregorianCalendar gc = new GregorianCalendar();
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    try {
      if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150 || (gc.getTime().getTime()
          - s.parse(strYear + "-" + strMonth + "-" + strDay).getTime()) < 0) {
        errorMessage.append("身份证生日不在有效范围。");
        return errorMessage.toString();
      }
    } catch (NumberFormatException e) {
      log.error("context", e);
    } catch (java.text.ParseException e) {
      log.error("context", e);
    }
    if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) == 0) {
      errorMessage.append("身份证月份无效");
      return errorMessage.toString();
    }
    if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) == 0) {
      errorMessage.append("身份证日期无效");
      return errorMessage.toString();
    }
    // =====================(end)=====================

    // ================ 地区码时候有效 ================

    if (hashtable.get(Ai.substring(0, 2)) == null) {
      errorMessage.append("身份证地区编码错误。");
      return errorMessage.toString();
    }
    // ==============================================

    // ================ 判断最后一位的值 ================
    int TotalmulAiWi = 0;
    for (int i = 0; i < 17; i++) {
      TotalmulAiWi =
          TotalmulAiWi + Integer.parseInt(String.valueOf(Ai.charAt(i))) * Integer.parseInt(Wi[i]);
    }
    int modValue = TotalmulAiWi % 11;
    String strVerifyCode = ValCodeArr[modValue];
    Ai = Ai + strVerifyCode;

    if (idCard.length() == 18) {
      if (Ai.equals(idCard) == false) {
        errorMessage.append("身份证无效，不是合法的身份证号码");
        return errorMessage.toString();
      }
    } else {
      return "";
    }
    // =====================(end)=====================
    return "";
  }

  private final static Hashtable<String, String> hashtable = new Hashtable<String, String>();
  static {
    hashtable.put("11", "北京");
    hashtable.put("12", "天津");
    hashtable.put("13", "河北");
    hashtable.put("14", "山西");
    hashtable.put("15", "内蒙古");
    hashtable.put("21", "辽宁");
    hashtable.put("22", "吉林");
    hashtable.put("23", "黑龙江");
    hashtable.put("31", "上海");
    hashtable.put("32", "江苏");
    hashtable.put("33", "浙江");
    hashtable.put("34", "安徽");
    hashtable.put("35", "福建");
    hashtable.put("36", "江西");
    hashtable.put("37", "山东");
    hashtable.put("41", "河南");
    hashtable.put("42", "湖北");
    hashtable.put("43", "湖南");
    hashtable.put("44", "广东");
    hashtable.put("45", "广西");
    hashtable.put("46", "海南");
    hashtable.put("50", "重庆");
    hashtable.put("51", "四川");
    hashtable.put("52", "贵州");
    hashtable.put("53", "云南");
    hashtable.put("54", "西藏");
    hashtable.put("61", "陕西");
    hashtable.put("62", "甘肃");
    hashtable.put("63", "青海");
    hashtable.put("64", "宁夏");
    hashtable.put("65", "新疆");
    hashtable.put("71", "台湾");
    hashtable.put("81", "香港");
    hashtable.put("82", "澳门");
    hashtable.put("91", "国外");
  }


  /**
   * 功能：判断字符串是否为日期格式
   *
   * @param strDate
   * @return
   */
  public static boolean isDate(String strDate) {
    Pattern pattern = Pattern.compile(
        "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
    Matcher m = pattern.matcher(strDate);
    if (m.matches()) {
      return true;
    } else {
      return false;
    }
  }

  public final static String getRandomString() {
    Random random = new Random();
    Integer r = random.nextInt();
    return org.apache.commons.lang3.StringUtils.leftPad(String.valueOf(r), 6, "0");
  }

  // 根据Unicode编码完美的判断中文汉字和符号
  private static boolean isChinese(char c) {
    Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
    if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
        || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
        || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
        || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
        || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
        || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
        || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
      return true;
    }
    return false;
  }

  // 完整的判断中文汉字和符号
  public static boolean isChinese(String strName) {
    char[] ch = strName.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      char c = ch[i];
      if (isChinese(c)) {
        return true;
      }
    }
    return false;
  }

  // 只能判断部分CJK字符（CJK统一汉字）
  public static boolean isChineseByREG(String str) {
    if (str == null) {
      return false;
    }
    Pattern pattern = Pattern.compile("[\\u4E00-\\u9FBF]+");
    return pattern.matcher(str.trim()).find();
  }

  // 校验数组是否存在blank字段
  public static boolean checkBlank(String... strings) {
    for (String str : strings) {
      if (StringUtil.isBlank(str)) return true;
    }
    return false;
  }


  public static String urlEncodeUTF8(String source) {
    String result = source;
    try {
      result = java.net.URLEncoder.encode(source, "utf-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return result;
  }



  /**
   * 解码 Unicode \\uXXXX
   * 
   * @param str
   * @return
   */
  public static String decodeUnicode(String str) {
    Charset set = Charset.forName("UTF-16");
    Pattern p = Pattern.compile("\\\\u([0-9a-fA-F]{4})");
    Matcher m = p.matcher(str);
    int start = 0;
    int start2 = 0;
    StringBuffer sb = new StringBuffer();
    while (m.find(start)) {
      start2 = m.start();
      if (start2 > start) {
        String seg = str.substring(start, start2);
        sb.append(seg);
      }
      String code = m.group(1);
      int i = Integer.valueOf(code, 16);
      byte[] bb = new byte[4];
      bb[0] = (byte) ((i >> 8) & 0xFF);
      bb[1] = (byte) (i & 0xFF);
      ByteBuffer b = ByteBuffer.wrap(bb);
      sb.append(String.valueOf(set.decode(b)).trim());
      start = m.end();
    }
    start2 = str.length();
    if (start2 > start) {
      String seg = str.substring(start, start2);
      sb.append(seg);
    }
    return sb.toString();
  }


  public static String getEncoding(String str) {
    String encode = "GB2312";
    try {
      if (str.equals(new String(str.getBytes(encode), encode))) {
        String s = encode;
        return s;
      }
    } catch (Exception exception) {}
    encode = "ISO-8859-1";
    try {
      if (str.equals(new String(str.getBytes(encode), encode))) {
        String s1 = encode;
        return s1;
      }
    } catch (Exception exception1) {}
    encode = "UTF-8";
    try {
      if (str.equals(new String(str.getBytes(encode), encode))) {
        String s2 = encode;
        return s2;
      }
    } catch (Exception exception2) {}
    encode = "GBK";
    try {
      if (str.equals(new String(str.getBytes(encode), encode))) {
        String s3 = encode;
        return s3;
      }
    } catch (Exception exception3) {}
    return "";
  }

}
