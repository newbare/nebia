package com.br.questquadirx.util.infra;



/*    */ public enum FilterOperator
/*    */ {
/*  9 */   EQ, NE, GT, LT, GE, LE, IS_NOT_NULL, IS_NULL, BETWEEN, LIKE, IN, NOT_IN, AND, OR, NOT, PAR_IN, PAR_OUT, TO_CHAR, TO_CHAR_DATE_OUT;
/*    */ 
/*    */   public static final String REMOVE_ACENTOS_1 = "        REPLACE( \n          REPLACE( \n            REPLACE( \n              REPLACE( \n                REPLACE( \n                  REPLACE( \n                    REPLACE( \n                      REPLACE( \n                        REPLACE( \n                          REPLACE( \n                          REPLACE( \n                            REPLACE( \n";
/*    */   public static final String REMOVE_ACENTOS_2 = ",'Õ','O') \n                          ,'Â','A') \n                          ,'Ü','U') \n                        ,'Ô','O') \n                      ,'Ê','E') \n                    ,'Ã','A') \n                  ,'Ç','C') \n                ,'É','E') \n              ,'Í','I') \n            ,'Ú','U') \n          ,'Ó','O') \n        ,'Á','A') \n";
/*    */   String stringValue;
/*    */   int numParams;
/*    */   boolean useParenthesis;
/*    */ 
/*    */   public String getStringValue()
/*    */   {
/* 70 */     return this.stringValue;
/*    */   }
/*    */ 
/*    */   public int getNumParams() {
/* 74 */     return this.numParams;
/*    */   }
/*    */ 
/*    */   public boolean isUseParenthesis() {
/* 78 */     return this.useParenthesis;
/*    */   }
/*    */ }

/* Location:           C:\Users\leite\.m2\repository\br\gov\saude\infraestrutura\persistencia\1.2.0\persistencia-1.2.0.jar
 * Qualified Name:     br.gov.saude.infraestrutura.persistence.util.FilterOperator
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.5.3
 */