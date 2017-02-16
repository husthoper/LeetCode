package com.xiaomi.luo.ErrorHandler;

public enum DBExceptionEnums{  
    
    UNIQUE_KEY(10001, "主键约束错误"),
	NOT_COMPLEMENT(10002, "参数不完整");
      
    public int code;  
    public String message;  
      
    private DBExceptionEnums(int code, String message){  
        this.code = code;  
        this.message = message;  
    }  
      
    public int getCode() {  
        return code;  
    }  
  
    public String getMessage() {  
        return message;  
    }  
    public static void main(String[] args) {
    	System.out.println(UNIQUE_KEY.name());
    	System.out.println(UNIQUE_KEY.ordinal());
    	DBExceptionEnums[] exceptions = DBExceptionEnums.values();
    	System.out.println(exceptions.length);
	}
}  
