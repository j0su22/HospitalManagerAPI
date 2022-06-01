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
@Table(name = "T_CASE", catalog = "ProyectoFinal")
public class Case implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CASE")
    private int idCase;

    @OneToMany
    @JoinColumn(name = "ID_DISEASE", referencedColumnName = "ID_DISEASE")
    private Account idDisease;

    @OneToMany
    @JoinColumn(name = "ID_ACCOUNT", referencedColumnName = "ID_ACCOUNT")
    private Account idAccount;

    @OneToMany
    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL")
    private Account idHospital;
}
