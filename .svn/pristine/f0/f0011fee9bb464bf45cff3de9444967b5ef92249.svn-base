package com.shenmintech.cbp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


/**
 * 接口访问错误信息加载类
 * 
 * @author max
 *
 */
@Data
@Component
@ConfigurationProperties(locations = "classpath:error-msg.yml", prefix = "httpErrorMsg")
public class HttpErrorMsg {

  @Data
  public static class BaseFailData {// 错误码+错误信息
    private Integer codeFail;
    private String msgFail;
  }

  @Data
  public static class FErrors {// 公共通用异常码
    public VariMiss variMiss;// 参数缺失--------------------------------001

    public static class VariMiss extends BaseFailData {}

    public VariIllegal variIllegal;// 参数非法--------------------------002

    public static class VariIllegal extends BaseFailData {}

    public SysInnerExc sysInnerExc;// 内部异常--------------------------003

    public static class SysInnerExc extends BaseFailData {}

    public ThirdApiExc thirdApiExc;// 第三方接口调用异常-----------------004

    public static class ThirdApiExc extends BaseFailData {}

    public ModuleTransExc moduleTransExc;// 模块间互相调用失败-----------005

    public static class ModuleTransExc extends BaseFailData {}

    public ProcessExc processExc;// 业务流程异常-------------------------006

    public static class ProcessExc extends BaseFailData {}

    public PermissioDenied permissioDenied;// 没有权限-------------------007

    public static class PermissioDenied extends BaseFailData {}

    public UnameOrPwordExc unameOrPwordExc;// 用户名或者密码错误----------008

    public static class UnameOrPwordExc extends BaseFailData {}
    
    public HasBeenAdded hasBeenAdded;// 用户名或者密码错误----------009
    
    public static class HasBeenAdded extends BaseFailData {}

    public AlreadyExists alreadyExists;// 该用户ID已经注册为老师，在网易已经通过userId生成过身份了----------010
    
    public static class AlreadyExists extends BaseFailData {}
  }

  // CompanyController
  private AddCompany addCompany;

  public static class AddCompany extends FErrors {}

  private PutTKcCompany putTKcCompany;

  public static class PutTKcCompany extends FErrors {}

  private GetTKcCompany getTKcCompany;

  public static class GetTKcCompany extends FErrors {}

  private GetSingleCompany getSingleCompany;

  public static class GetSingleCompany extends FErrors {}

  // CourseController
  private PostTKcCourse postTKcCourse;

  public static class PostTKcCourse extends FErrors {}

  private GetTKcCourse getTKcCourse;

  public static class GetTKcCourse extends FErrors {}

  private GetTKcCourseTable getTKcCourseTable;

  public static class GetTKcCourseTable extends FErrors {}

  private PutCourseTable putCourseTable;

  public static class PutCourseTable extends FErrors {}

  // GroupController
  private PostTKcGroup postTKcGroup;

  public static class PostTKcGroup extends FErrors {}

  private PutTKcGroup putTKcGroup;

  public static class PutTKcGroup extends FErrors {}

  private GetTKcGroup getTKcGroup;

  public static class GetTKcGroup extends FErrors {}

  // ClazzController
  private PostTKcClazz postTKcClazz;

  public static class PostTKcClazz extends FErrors {}

  private GetTKcClazzById getTKcClazzById;

  public static class GetTKcClazzById extends FErrors {}

  // EmployeeController
  private PostTKcEmployee postTKcEmployee;

  public static class PostTKcEmployee extends FErrors {}

  private GetTKcEmployee getTKcEmployee;

  public static class GetTKcEmployee extends FErrors {}

  private PostUserEmployeeStudent postUserEmployeeStudent;

  public static class PostUserEmployeeStudent extends FErrors {}

  private GetUserNtesData getUserNtesData;

  public static class GetUserNtesData extends FErrors {}

  // StudentController
  private PostTKcStudent postTKcStudent;

  public static class PostTKcStudent extends FErrors {}

  private DeleteTKcStudent deleteTKcStudent;

  public static class DeleteTKcStudent extends FErrors {}

  private PutTKcStudent putTKcStudent;

  public static class PutTKcStudent extends FErrors {}

  private GetTKcHSRelation getTKcHSRelation;

  public static class GetTKcHSRelation extends FErrors {}

  private GetTUserRelation getTUserRelation;

  public static class GetTUserRelation extends FErrors {}

  private GetTUserInfo getTUserInfo;

  public static class GetTUserInfo extends FErrors {}

  // HomeworkController
  private PostTKcHomework postTKcHomework;

  public static class PostTKcHomework extends FErrors {}

  private GetTKcHomework getTKcHomework;

  public static class GetTKcHomework extends FErrors {}

  private DeleteTKcHomework deleteTKcHomework;

  public static class DeleteTKcHomework extends FErrors {}

  private PutTKcHomework putTKcHomework;

  public static class PutTKcHomework extends FErrors {}

  // HomeworkPushController
  private PreHomework preHomework;

  public static class PreHomework extends FErrors {}

  private PostHomework postHomework;

  public static class PostHomework extends FErrors {}

  private GetHomeworks getHomeworks;

  public static class GetHomeworks extends FErrors {}

  private PutHomework putHomework;

  public static class PutHomework extends FErrors {}

  // AuthController
  private Login login;

  public static class Login extends FErrors {}

  // RoomController
  private GetNtesRoom getNtesRoom;

  public static class GetNtesRoom extends FErrors {}

  // Course4AppController
  private GetTKcCourseByUid getTKcCourseByUid;

  public static class GetTKcCourseByUid extends FErrors {}

  private GetTKcHomeworkStudentRelationByUid getTKcHomeworkStudentRelationByUid;

  public static class GetTKcHomeworkStudentRelationByUid extends FErrors {}

  private GetTKcHomeworkStudentRelationByRelationId getTKcHomeworkStudentRelationByRelationId;

  public static class GetTKcHomeworkStudentRelationByRelationId extends FErrors {}

  private GetTKcHomeworkStudentRelationByRelationId2 getTKcHomeworkStudentRelationByRelationId2;

  public static class GetTKcHomeworkStudentRelationByRelationId2 extends FErrors {}

  private GetTKcHomeworkStudentRelationByRelationId3 getTKcHomeworkStudentRelationByRelationId3;

  public static class GetTKcHomeworkStudentRelationByRelationId3 extends FErrors {}

  private PostHomeworkPicTxt postHomeworkPicTxt;

  public static class PostHomeworkPicTxt extends FErrors {}

  private PostHomeworkSignCard postHomeworkSignCard;

  public static class PostHomeworkSignCard extends FErrors {}

  private PostHomeworkWorkCard postHomeworkWorkCard;

  public static class PostHomeworkWorkCard extends FErrors {}

  private GetUserInfo getUserInfo;

  public static class GetUserInfo extends FErrors {}

  // RecordController
  private DeleteRecord deleteRecord;

  public static class DeleteRecord extends FErrors {}

  private PostTKcRecord postTKcRecord;

  public static class PostTKcRecord extends FErrors {}

  private PutTKcRecordStatus putTKcRecordStatus;

  public static class PutTKcRecordStatus extends FErrors {}

  private PutTKcRecord putTKcRecord;

  public static class PutTKcRecord extends FErrors {}

  private PatchTKcRecordIndex patchTKcRecordIndex;

  public static class PatchTKcRecordIndex extends FErrors {}

  private GetTKcRecords4App getTKcRecords4App;

  public static class GetTKcRecords4App extends FErrors {}

  private GetRecordsByType getRecordsByType;

  public static class GetRecordsByType extends FErrors {}

  private GetTKcRecord4App getTKcRecord4App;

  public static class GetTKcRecord4App extends FErrors {}

  private GetUCR getUCR;

  public static class GetUCR extends FErrors {}

  // ActionController
  private PostUCR postUCR;

  public static class PostUCR extends FErrors {}

  private PostUPR postUPR;

  public static class PostUPR extends FErrors {}

  private PostULR postULR;

  public static class PostULR extends FErrors {}

  private PostULRCancel postULRCancel;

  public static class PostULRCancel extends FErrors {}

  private PostUCA postUCA;

  public static class PostUCA extends FErrors {}

  private PostUCACancel postUCACancel;

  public static class PostUCACancel extends FErrors {}

  private PostURA postURA;

  public static class PostURA extends FErrors {}

  private PostUCRCancel postUCRCancel;

  public static class PostUCRCancel extends FErrors {}


  // RollingPictureController
  private PostTKcRollingPic postTKcRollingPic;

  public static class PostTKcRollingPic extends FErrors {}

  private GetTKcRollingPics getTKcRollingPics;

  public static class GetTKcRollingPics extends FErrors {}

  private GetTKcRollingPic getTKcRollingPic;

  public static class GetTKcRollingPic extends FErrors {}

  private PutTKcRollingPic putTKcRollingPic;

  public static class PutTKcRollingPic extends FErrors {}

  private GetTKcRPs4App getTKcRPs4App;

  public static class GetTKcRPs4App extends FErrors {}

}
