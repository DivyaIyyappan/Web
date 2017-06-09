import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
public class User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name="active")
	private Boolean active;

}


}
