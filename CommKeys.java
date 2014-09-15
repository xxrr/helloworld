/*******************************************************************************
 * 文件名: CommKeys.java
 * 版　权: Copyright 2014 北京天源迪科信息技术有限公司
 * 创建人: Zhang Zhizheng(zhangzz@tydic.com)
 * 日　期: 2014-02-09 13:40:30
 * 描　述: 
 * 修改人: 
 * 日　期:
 * 描　述: 
 * 描　述: 文件描述
 * 版　本: 1.0
 *******************************************************************************/
package com.dic.vopclient.util;


public class CommKeys {
	
	public static final String CHAR_ENCODING = "UTF-8";
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_ORA = "yyyy-mm-dd hh24:mi:ss";
	public static final String DATE_FORMAT1 = "yyyyMMddHHmmss";
	public static final int CONN_TIME_OUT = 30000;
	public static final int READ_TIME_OUT = 120000;

	// VOP Server
	public static final String KEY_VOP_URL = "vop.url";
	public static final String KEY_API_VERSION = "api.version";
	
	public static final String VAL_VOP_URL = "http://api.vop.chinaunicom.cn";
	public static final String VAL_API_VERSION = "v1";
	
	// VOP Client
	public static final String KEY_SLEEP_TIME = "sleep.time";
	public static final String KEY_ERROT_CODES = "S-SC-001,S-SC-002,S-SC-003,S-SC-004,S-SC-005,S-SC-006,S-SC-007,S-PE-001,S-PE-002";
	
	// 请求
	public static final String KEY_MVNOKEY = "mvnokey";
	public static final String KEY_MVNO_SECRET = "mvno_secret";
	
	// 认证
	public static final String VAL_AUTH_SERVICE_TYPE = "system_service";
	public static final String VAL_AUTH_SERVICE_NAME = "authorize";
	public static final String VAL_AUTH_API_NAME = "cu.vop.system_service.authorize";
	
	// DB
	// Query SQL
	public static final String QRY_SERVICE_SQLS = "query_service_sqls";
	public static final String UPDATE_SERVICE_SQLS = "update_service_sqls";
	public static final String QRY_COMM_SQLS = "query_comm_sqls";
	// Table COMM_GSM
	public static final String COL_SERVICE_SN = "SERVICE_SN";
	public static final String COL_COMM_SN = "COMM_SN";
	// Table LOG_SERVICE_IB
	//public static final String COL_SERV_CODE = "SERV_CODE";
	
	public static final String COL_INTER_CODE = "INTER_CODE";
	
	public static final String collection_instCode_vop = "('VOP01','VOP02','VOP03','VOP04','VOP05','VOP06','VOP07','VOP08','VOP09','VOP10','VOP11','VOP12','VOP13','VOP14','VOP15','VOP16','VOP17','VOP18','VOP19')";	
	public static final String collection_instCode_vop_key = "#collection_instCode_vop#";
	public static final String collection_instCode_vop_without_vop17 = "('VOP01','VOP02','VOP03','VOP04','VOP05','VOP06','VOP07','VOP08','VOP09','VOP10','VOP11','VOP12','VOP13','VOP14','VOP15','VOP16','VOP18','VOP19')";	
	
	public static final String TOKEN = "token";
	public static final String ProducerCount = "producerCount";
	public static final String InNetInst = "VOP01,VOP05,VOP09,VOP18,VOP19";
	public static final String COL_USER_NO = "USER_NO";
	public static final String COL_INST_CODE = "INST_CODE";
	public static final String InNetApiNames = "'cu.vop.basic_service.register_account','cu.vop.extended_service.blankcard_register_account'";
	
	public static final String INVOKE_LOG_STATUS_SEND_SUCC = "1";
	public static final String INVOKE_LOG_STATUS_SEND_FAIL = "2";
	public static final String INVOKE_LOG_STATUS_PRESEND_FAIL = "3";
	
	// 呼叫转移-修改
	public static final String COL_VOP_CODE = "'V0016','V0017','V0018','V0019'";
	public static final String COL_ACTION_PE = "modify";
	// 停开机-短信-语音
	public static final String ACTION_TYPE_OFF_ON = "off,on,halfoff";
	public static final String SMS_PRODUNCT_ID = "V0003";
	public static final String VOICE_PRODUNCT_ID = "V0001";
	public static final String DATA_PRODUNCT_ID = "V0002";
	//指令
	public static final String COL_SERVICE_CODE = "'V0001','V0002','V0003','V0004','V0010','V0014','V0016','V0017','V0018','V0019','V0022'";
}
