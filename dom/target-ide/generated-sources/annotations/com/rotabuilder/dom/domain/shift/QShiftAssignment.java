package com.rotabuilder.dom.domain.shift;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QShiftAssignment extends com.rotabuilder.dom.domain.solver.QAbstractPersistable
{
    public static final QShiftAssignment jdoCandidate = candidate("this");

    public static QShiftAssignment candidate(String name)
    {
        return new QShiftAssignment(null, name, 5);
    }

    public static QShiftAssignment candidate()
    {
        return jdoCandidate;
    }

    public static QShiftAssignment parameter(String name)
    {
        return new QShiftAssignment(ShiftAssignment.class, name, ExpressionType.PARAMETER);
    }

    public static QShiftAssignment variable(String name)
    {
        return new QShiftAssignment(ShiftAssignment.class, name, ExpressionType.VARIABLE);
    }

    public final com.rotabuilder.dom.domain.shift.QShift shift;
    public final com.rotabuilder.dom.domain.employee.QEmployee employee;

    public QShiftAssignment(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.shift = new com.rotabuilder.dom.domain.shift.QShift(this, "shift", depth-1);
        }
        else
        {
            this.shift = null;
        }
        if (depth > 0)
        {
            this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", depth-1);
        }
        else
        {
            this.employee = null;
        }
    }

    public QShiftAssignment(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.shift = new com.rotabuilder.dom.domain.shift.QShift(this, "shift", 5);
        this.employee = new com.rotabuilder.dom.domain.employee.QEmployee(this, "employee", 5);
    }
}
