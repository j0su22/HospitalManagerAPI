package csf6.grupo2.HospitalManagerAPI.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "T_HOSPITAL", catalog = "ProyectoFinal")
public class THospital implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HOSPITAL")
    private int idHospital;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STREET")
    private String street;

    @ManyToOne
    @JoinColumn(name = "ID_CITY", referencedColumnName = "ID_CITY")
    private TCity idCity;
}
