package csf6.grupo2.HospitalManagerAPI.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_USER", catalog = "ProyectoFinal")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private int idHospital;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "WEIGHT")
    private float weight;

    @Column(name = "HEIGHT")
    private float height;

    @Column(name = "GENDER")
    private char gender;

    @Column(name = "RESIDENCE")
    private String residence;

    @OneToOne
    @JoinColumn(name = "ID_ACCOUNT", referencedColumnName = "ID_ACCOUNT")
    private Account idAccount;
}
