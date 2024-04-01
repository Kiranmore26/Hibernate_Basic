package Com.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Crickethistory")
public class Cricketers 
{
	@Id
	@Column(name = "Crickets_Id",length = 10,nullable = false,unique = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Crickets_Name",length = 240,nullable = false,unique = false)
	private String Name;
	@Column(name = "Match_played",length = 10,nullable = false,unique = false)
	private int Match_played;
	@Column(name = "Total_score",length = 10,nullable = false,unique = false)
	private int Total_Score;
	
	
	public Cricketers() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public Cricketers(String name, int match_played, int total_Score) {
		super();
		Name = name;
		Match_played = match_played;
		Total_Score = total_Score;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getMatch_played() {
		return Match_played;
	}


	public void setMatch_played(int match_played) {
		Match_played = match_played;
	}


	public int getTotal_Score() {
		return Total_Score;
	}


	public void setTotal_Score(int total_Score) {
		Total_Score = total_Score;
	}


	@Override
	public String toString() {
		return "Cricketers [id=" + id + ", Name=" + Name + ", Match_played=" + Match_played + ", Total_Score="
				+ Total_Score + "]";
	}
	
	
	
	
}
