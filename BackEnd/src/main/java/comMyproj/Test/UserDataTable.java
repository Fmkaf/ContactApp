package comMyproj.Test;
import javax.persistence.*;

@Entity
@Table(name="UserData")
public class UserDataTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="userName")
	private String userName;
	@Column(name="passWord")
	private String passWord;
	@Column(name="secretCode")
	private String secretCode;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getSecretCode() {
		return secretCode;
	}
	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	public UserDataTable(String userName, String passWord, String secretCode) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.secretCode = secretCode;
	}
	public UserDataTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

@Entity
@Table(name="ContactTable")
class ContactTable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="number")
	private String number;
	@Column(name="email")
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContactTable(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}
	public ContactTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
