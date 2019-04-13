package com.rotabuilder.dom.domain.pattern;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPattern extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QPattern jdoCandidate = candidate("this");

    public static QPattern candidate(String name)
    {
        return new QPattern(null, name, 5);
    }

    public static QPattern candidate()
    {
        return jdoCandidate;
    }

    public static QPattern parameter(String name)
    {
        return new QPattern(Pattern.class, name, ExpressionType.PARAMETER);
    }

    public static QPattern variable(String name)
    {
        return new QPattern(Pattern.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression code;
    public final NumericExpression<Integer> weight;

    public QPattern(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.code = new StringExpressionImpl(this, "code");
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }

    public QPattern(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.code = new StringExpressionImpl(this, "code");
        this.weight = new NumericExpressionImpl<Integer>(this, "weight");
    }
}
