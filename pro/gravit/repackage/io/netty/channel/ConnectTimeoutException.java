/*    */ package pro.gravit.repackage.io.netty.channel;
/*    */ 
/*    */ import java.net.ConnectException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConnectTimeoutException
/*    */   extends ConnectException
/*    */ {
/*    */   private static final long serialVersionUID = 2317065249988317463L;
/*    */   
/*    */   public ConnectTimeoutException(String msg) {
/* 28 */     super(msg);
/*    */   }
/*    */   
/*    */   public ConnectTimeoutException() {}
/*    */ }


/* Location:              C:\Users\Main\AppData\Roaming\StreamCraf\\updates\Launcher.jar!\pro\gravit\repackage\io\netty\channel\ConnectTimeoutException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */