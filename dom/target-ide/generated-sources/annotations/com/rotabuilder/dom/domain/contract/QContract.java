package com.rotabuilder.dom.domain.contract;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QContract extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QContract jdoCandidate = candidate("this");

    public static QContract candidate(String name)
    {
        return new QContract(null, name, 5);
    }

    public static QContract candidate()
    {
        return jdoCandidate;
    }

    public static QContract parameter(String name)
    {
        return new QContract(Contract.class, name, ExpressionType.PARAMETER);
    }

    public static QContract variable(String name)
    {
        return new QContract(Contract.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression code;
    public final StringExpression description;
    public final ObjectExpression<com.rotabuilder.dom.domain.pattern.WeekendDefinition> weekendDefinition;
    public final ListExpression contractLineList;
    public final ListExpression patternList;

    public QContract(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.code = new StringExpressionImpl(this, "code");
        this.description = new StringExpressionImpl(this, "description");
        this.weekendDefinition = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.WeekendDefinition>(this, "weekendDefinition");
        this.contractLineList = new ListExpressionImpl(this, "contractLineList");
        this.patternList = new ListExpressionImpl(this, "patternList");
    }

    public QContract(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.code = new StringExpressionImpl(this, "code");
        this.description = new StringExpressionImpl(this, "description");
        this.weekendDefinition = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.WeekendDefinition>(this, "weekendDefinition");
        this.contractLineList = new ListExpressionImpl(this, "contractLineList");
        this.patternList = new ListExpressionImpl(this, "patternList");
    }
}
