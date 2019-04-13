package com.rotabuilder.dom.domain.employee;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QEmployee extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QEmployee jdoCandidate = candidate("this");

    public static QEmployee candidate(String name)
    {
        return new QEmployee(null, name, 5);
    }

    public static QEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QEmployee parameter(String name)
    {
        return new QEmployee(Employee.class, name, ExpressionType.PARAMETER);
    }

    public static QEmployee variable(String name)
    {
        return new QEmployee(Employee.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression code;
    public final StringExpression name;
    public final com.rotabuilder.dom.domain.contract.QContract contract;
    public final CollectionExpression skills;
    public final ListExpression dayOffRequests;
    public final ListExpression dayOnRequests;
    public final ListExpression shiftOffRequests;
    public final ListExpression shiftOnRequests;

    public QEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.code = new StringExpressionImpl(this, "code");
        this.name = new StringExpressionImpl(this, "name");
        if (depth > 0)
        {
            this.contract = new com.rotabuilder.dom.domain.contract.QContract(this, "contract", depth-1);
        }
        else
        {
            this.contract = null;
        }
        this.skills = new CollectionExpressionImpl(this, "skills");
        this.dayOffRequests = new ListExpressionImpl(this, "dayOffRequests");
        this.dayOnRequests = new ListExpressionImpl(this, "dayOnRequests");
        this.shiftOffRequests = new ListExpressionImpl(this, "shiftOffRequests");
        this.shiftOnRequests = new ListExpressionImpl(this, "shiftOnRequests");
    }

    public QEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.code = new StringExpressionImpl(this, "code");
        this.name = new StringExpressionImpl(this, "name");
        this.contract = new com.rotabuilder.dom.domain.contract.QContract(this, "contract", 5);
        this.skills = new CollectionExpressionImpl(this, "skills");
        this.dayOffRequests = new ListExpressionImpl(this, "dayOffRequests");
        this.dayOnRequests = new ListExpressionImpl(this, "dayOnRequests");
        this.shiftOffRequests = new ListExpressionImpl(this, "shiftOffRequests");
        this.shiftOnRequests = new ListExpressionImpl(this, "shiftOnRequests");
    }
}
