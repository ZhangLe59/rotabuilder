package com.rotabuilder.dom.domain.contract;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QMinMaxContractLine extends com.rotabuilder.dom.domain.contract.QContractLine
{
    public static final QMinMaxContractLine jdoCandidate = candidate("this");

    public static QMinMaxContractLine candidate(String name)
    {
        return new QMinMaxContractLine(null, name, 5);
    }

    public static QMinMaxContractLine candidate()
    {
        return jdoCandidate;
    }

    public static QMinMaxContractLine parameter(String name)
    {
        return new QMinMaxContractLine(MinMaxContractLine.class, name, ExpressionType.PARAMETER);
    }

    public static QMinMaxContractLine variable(String name)
    {
        return new QMinMaxContractLine(MinMaxContractLine.class, name, ExpressionType.VARIABLE);
    }

    public final BooleanExpression minimumEnabled;
    public final NumericExpression<Integer> minimumValue;
    public final NumericExpression<Integer> minimumWeight;
    public final BooleanExpression maximumEnabled;
    public final NumericExpression<Integer> maximumValue;
    public final NumericExpression<Integer> maximumWeight;

    public QMinMaxContractLine(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.minimumEnabled = new BooleanExpressionImpl(this, "minimumEnabled");
        this.minimumValue = new NumericExpressionImpl<Integer>(this, "minimumValue");
        this.minimumWeight = new NumericExpressionImpl<Integer>(this, "minimumWeight");
        this.maximumEnabled = new BooleanExpressionImpl(this, "maximumEnabled");
        this.maximumValue = new NumericExpressionImpl<Integer>(this, "maximumValue");
        this.maximumWeight = new NumericExpressionImpl<Integer>(this, "maximumWeight");
    }

    public QMinMaxContractLine(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.minimumEnabled = new BooleanExpressionImpl(this, "minimumEnabled");
        this.minimumValue = new NumericExpressionImpl<Integer>(this, "minimumValue");
        this.minimumWeight = new NumericExpressionImpl<Integer>(this, "minimumWeight");
        this.maximumEnabled = new BooleanExpressionImpl(this, "maximumEnabled");
        this.maximumValue = new NumericExpressionImpl<Integer>(this, "maximumValue");
        this.maximumWeight = new NumericExpressionImpl<Integer>(this, "maximumWeight");
    }
}
