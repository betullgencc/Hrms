package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
		
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String password;
		public Users(int id, String email, String password) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
		}
		
		public Users() {}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		

	}
