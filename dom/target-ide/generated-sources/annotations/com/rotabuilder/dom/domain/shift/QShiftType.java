package com.rotabuilder.dom.domain.shift;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftType extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShiftType jdoCandidate = candidate("this");

    public static QShiftType candidate(String name)
    {
        return new QShiftType(null, name, 5);
    }

    public static QShiftType candidate()
    {
        return jdoCandidate;
    }

    public static QShiftType parameter(String name)
    {
        return new QShiftType(ShiftType.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftType variable(String name)
    {
        return new QShiftType(ShiftType.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression code;
    public final NumericExpression<Integer> index;
    public final StringExpression startTimeString;
    public final StringExpression endTimeString;
    public final BooleanExpression night;
    public final StringExpression description;
    public final CollectionExpression skills;

    public QShiftType(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.code = new StringExpressionImpl(this, "code");
        this.index = new NumericExpressionImpl<Integer>(this, "index");
        this.startTimeString = new StringExpressionImpl(this, "startTimeString");
        this.endTimeString = new StringExpressionImpl(this, "endTimeString");
        this.night = new BooleanExpressionImpl(this, "night");
        this.description = new StringExpressionImpl(this, "description");
        this.skills = new CollectionExpressionImpl(this, "skills");
    }

    public QShiftType(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.code = new StringExpressionImpl(this, "code");
        this.index = new NumericExpressionImpl<Integer>(this, "index");
        this.startTimeString = new StringExpressionImpl(this, "startTimeString");
        this.endTimeString = new StringExpressionImpl(this, "endTimeString");
        this.night = new BooleanExpressionImpl(this, "night");
        this.description = new StringExpressionImpl(this, "description");
        this.skills = new CollectionExpressionImpl(this, "skills");
    }
}
