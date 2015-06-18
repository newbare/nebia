package com.br.questquadirx.util.infra;

/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Paginacao
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -2591041822148041507L;
/*    */   private Integer posicao;
/*    */   private Integer limite;
/*    */ 
/*    */   public Paginacao()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Paginacao(Integer posicao, Integer limite)
/*    */   {
/* 23 */     this.posicao = posicao;
/* 24 */     this.limite = limite;
/*    */   }
/*    */ 
/*    */   public Integer getLimite() {
/* 28 */     return this.limite;
/*    */   }
/*    */ 
/*    */   public Integer getPosicao() {
/* 32 */     return this.posicao;
/*    */   }
/*    */ 
/*    */   public void setLimite(Integer limite) {
/* 36 */     this.limite = limite;
/*    */   }
/*    */ 
/*    */   public void setPosicao(Integer posicao) {
/* 40 */     this.posicao = posicao;
/*    */   }
/*    */ }

/* Location:           C:\Users\leite\.m2\repository\br\gov\saude\infraestrutura\persistencia\1.2.0\persistencia-1.2.0.jar
 * Qualified Name:     br.gov.saude.infraestrutura.persistence.to.Paginacao
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.5.3
 */