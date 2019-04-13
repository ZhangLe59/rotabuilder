package com.rotabuilder.dom.domain.shift;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftDate extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShiftDate jdoCandidate = candidate("this");

    public static QShiftDate candidate(String name)
    {
        return new QShiftDate(null, name, 5);
    }

    public static QShiftDate candidate()
    {
        return jdoCandidate;
    }

    public static QShiftDate parameter(String name)
    {
        return new QShiftDate(ShiftDate.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftDate variable(String name)
    {
        return new QShiftDate(ShiftDate.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> dayIndex;
    public final StringExpression dateString;
    public final ObjectExpression<com.rotabuilder.dom.domain.pattern.DayOfWeek> dayOfWeek;
    public final ListExpression shiftList;
    public final ObjectExpression<org.apache.isis.applib.services.title.TitleService> titleService;

    public QShiftDate(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.dayIndex = new NumericExpressionImpl<Integer>(this, "dayIndex");
        this.dateString = new StringExpressionImpl(this, "dateString");
        this.dayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "dayOfWeek");
        this.shiftList = new ListExpressionImpl(this, "shiftList");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
    }

    public QShiftDate(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.dayIndex = new NumericExpressionImpl<Integer>(this, "dayIndex");
        this.dateString = new StringExpressionImpl(this, "dateString");
        this.dayOfWeek = new ObjectExpressionImpl<com.rotabuilder.dom.domain.pattern.DayOfWeek>(this, "dayOfWeek");
        this.shiftList = new ListExpressionImpl(this, "shiftList");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
    }
}
