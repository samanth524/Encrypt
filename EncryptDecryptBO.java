# Encrypt
#Encryption and Decription

#import _._._._.DocumentIdEncryptor;
import DocumentIdEncryptor;
import java.net.URLEncoder;

        public decrypt{
          String fnDocId = null;
         	String encyfnDocId = null;
    			
    			
    			String sessionId_Passed = session!=null?(String)session.get("sessionId"):"";
    			String userID_Passed = session!=null?(String)session.get("userID"):"";
    			String key_Passed = sessionId_Passed+userID_Passed;
    			DocumentIdEncryptor documentIdEncryptor = new DocumentIdEncryptor(key_Passed);
          
          if(request.containsKey("fnDocId")){
    				encyfnDocId = (String) request.get("fnDocId");
    				fnDocId = documentIdEncryptor.decryptDocumentID(encyfnDocId);
    			}
          
          }
          
       public encrypt{
       
        String sessionId_Passed = session!=null?(String)session.getAttribute("sessionId"):"";
    	  String userID_Passed = session!=null?(String)session.getAttribute("userID"):"";
	      String key_Passed = sessionId_Passed+userID_Passed;
    	  DocumentIdEncryptor documentIdEncryptor = new DocumentIdEncryptor(key_Passed);
       
       }
       
