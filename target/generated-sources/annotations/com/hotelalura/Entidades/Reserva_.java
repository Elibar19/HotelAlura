package com.hotelalura.Entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-25T17:53:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Date> fechaSalida;
    public static volatile SingularAttribute<Reserva, String> valor;
    public static volatile SingularAttribute<Reserva, Date> fechaEntrada;
    public static volatile SingularAttribute<Reserva, Long> id;
    public static volatile SingularAttribute<Reserva, String> formaDePago;

}