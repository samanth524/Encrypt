# Encrypt
#Encryption and Decription
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
public class DocumentIdEncryptor{
	private final StandardPBEStringEncryptor encryptor;

	public DocumentIdEncryptor(final String sessionId_Passed) {
		encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(sessionId_Passed);
	}

	// This method will return the encrypted version of the plainText passed.
	public String encryptDocumentID(final String plainText) {
		return encryptor.encrypt(plainText);
	}

	// This method will return the decypted version of the excryptedPassword
	// passed.
	public String decryptDocumentID(final String encryptedPassword) {
		return encryptor.decrypt(encryptedPassword);
	}
}
