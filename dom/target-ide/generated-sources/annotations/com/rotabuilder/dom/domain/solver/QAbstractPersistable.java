package com.rotabuilder.dom.domain.solver;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAbstractPersistable extends PersistableExpressionImpl<AbstractPersistable> implements PersistableExpression<AbstractPersistable>
{
    public static final QAbstractPersistable jdoCandidate = candidate("this");

    public static QAbstractPersistable candidate(String name)
    {
        return new QAbstractPersistable(null, name, 5);
    }

    public static QAbstractPersistable candidate()
    {
        return jdoCandidate;
    }

    public static QAbstractPersistable parameter(String name)
    {
        return new QAbstractPersistable(AbstractPersistable.class, name, ExpressionType.PARAMETER);
    }

    public static QAbstractPersistable variable(String name)
    {
        return new QAbstractPersistable(AbstractPersistable.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression applicationTenancyPath;
    public final ObjectExpression<org.isisaddons.module.security.dom.tenancy.ApplicationTenancyRepository> applicationTenancyRepository;
    public final ObjectExpression<org.isisaddons.module.security.dom.user.ApplicationUserRepository> applicationUserRepository;
    public final ObjectExpression<org.apache.isis.applib.services.user.UserService> userService;

    public QAbstractPersistable(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.applicationTenancyPath = new StringExpressionImpl(this, "applicationTenancyPath");
        this.applicationTenancyRepository = new ObjectExpressionImpl<org.isisaddons.module.security.dom.tenancy.ApplicationTenancyRepository>(this, "applicationTenancyRepository");
        this.applicationUserRepository = new ObjectExpressionImpl<org.isisaddons.module.security.dom.user.ApplicationUserRepository>(this, "applicationUserRepository");
        this.userService = new ObjectExpressionImpl<org.apache.isis.applib.services.user.UserService>(this, "userService");
    }

    public QAbstractPersistable(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.applicationTenancyPath = new StringExpressionImpl(this, "applicationTenancyPath");
        this.applicationTenancyRepository = new ObjectExpressionImpl<org.isisaddons.module.security.dom.tenancy.ApplicationTenancyRepository>(this, "applicationTenancyRepository");
        this.applicationUserRepository = new ObjectExpressionImpl<org.isisaddons.module.security.dom.user.ApplicationUserRepository>(this, "applicationUserRepository");
        this.userService = new ObjectExpressionImpl<org.apache.isis.applib.services.user.UserService>(this, "userService");
    }
}
