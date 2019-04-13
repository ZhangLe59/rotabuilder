package com.rotabuilder.dom.domain.contract;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QBooleanContractLine extends com.rotabuilder.dom.domain.contract.QContractLine
{
    public static final QBooleanContractLine jdoCandidate = candidate("this");

    public static QBooleanContractLine candidate(String name)
    {
        return new QBooleanContractLine(null, name, 5);
    }

    public static QBooleanContractLine candidate()
    {
        return jdoCandidate;
    }

    public static QBooleanContractLine parameter(String name)
    {
        return new QBooleanContractLine(BooleanContractLine.class, name, ExpressionType.PARAMETER);
    }

    public static QBooleanContractLine variable(String name)
    {
        return new QBooleanContractLine(BooleanContractLine.class, name, ExpressionType.VARIABLE);
    }

    public final BooleanExpression enabled;
    public final NumericExpression<Integer> weight;

    public QBooleanContractLine(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.enabled = new BooleanExpressionImpl(this, "enabled");
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }

    public QBooleanContractLine(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.enabled = new BooleanExpressionImpl(this, "enabled");
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }
}
