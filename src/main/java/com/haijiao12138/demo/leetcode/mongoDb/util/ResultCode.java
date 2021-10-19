package com.haijiao12138.demo.leetcode.mongoDb.util;


public enum ResultCode {
    /*
    请求返回状态码和说明信息
     */
    SUCCESS(200, "成功"),

    BAD_REQUEST(400, "参数或者语法不对"),
    UNAUTHORIZED(401, "认证失败"),
    LOGIN_ERROR(402, "登录失败，手机号或密码无效"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "请求的资源不存在"),
    NOT_FOUNDDATA(200, "相关数据不存在"),

    OPERATE_ERROR(405, "操作失败，请求操作的资源不存在"),
    TIME_OUT(408, "请求超时"),

    SERVER_ERROR(500, "服务器内部错误"),

    GENERATOR_FAILURE(501,"生成失败"),
    SERVER_FAILURE(501,"操作失败"),
    UPDATE_FAILURE(500,"更新失败"),
    DELETE_FAILURE(500,"删除失败"),

    CHILD_DATA_EXIST(20001, "数据中包含子数据"),
    ROLE_LOAD_RESOURCES(20002, "资源已经使用，请在角色管理中解绑后，在操作"),
    DATA_EXIST(20003, "数据已经存在"),
    NOT_UPDATE(20004, "数据没有更新"),
    REPEAT_SUBMIT(20005, "数据提交重复，请勿重复操作"),

    ERROR_VERIFICATION_CODE (20009,"验证码错误"),
    RElATION_DELETE_ERROR1 (20010,"朝代与作者信息相关联 无法删除"),
    RElATION_DELETE_ERROR2 (20011,"作者与创作或文库信息相关联 无法删除"),
    RElATION_DELETE_ERROR3(20012,"分类与文库信息相关联 无法删除"),
    RElATION_DELETE_ERROR4 (20013,"文库与创作或卡片信息相关联 无法删除"),
    DYNASTY_REPEAT(20014,"朝代重复！"),
    CONTEST_REPEAT(20015,"竞技名称重复!"),
    CLASSIFICATION_REPEAT(20016,"分类名称重复!"),

    DEL_FAILURE(20020,"有关联数据，删除失败"),
    IMG_ERROR(20021,"最多上传九张图片"),

    FORGETPASSWORD_ERROR(20023, "修改成功"),
    REGISTER_ERROR(20024, "注册失败"),
    REGISTER_PHONE(20025, "该手机号已被注册"),
    NO_REGISTER_PHONE(20050, "该手机号未注册"),
    REGISTER_VERFICODE (20026, "请输入正确的验证码") ,
    REGISTER_PHONEFOMAT(20027, "手机号格式错误"),
    REGISTER_PASSWORD(20028, "两次输入的密码不一致"),
    REGISTER_VERFICODEERROR(20029, "验证码错误"),
    ONLOAD_ERROR(20030, "请完整输入信息!"),
    PHONE_ERROR(20026, "请填写手机号"),
    PHONE1_ERROR(20027, "请正确填写手机号!"),
    LOGIN_FORBIDDEN(20040, "您的账号已被禁用！"),




    NO_TITLE(20031,"此名片下没有题目"),
    AGAIN_VERIFICATION_CODE(20032,"请输入正确的验证码"),
    CONFIRM_ERROR(20033,"两次输入的密码不一致"),
    ERROR_PHONE(20034,"手机号格式错误"),
    DISABLE_ACCOUNT(20035,"该账号已禁用"),
    PASSWORD_ERROR(20036,"密码输入错误"),
    FAIL_UPDATE (20037,"修改密码失败"),
    FAIL_UPLOAD (20038,"上传失败") ,
    FAIL_ONLOAD (20039,"账号未登录，请先登录！"),

    NULL_ERROR(20041,"数据不能为空"),
    ;



    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
