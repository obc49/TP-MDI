/* This file was generated by SableCC (http://www.sablecc.org/). */

package tp6.analysis;

import java.util.*;
import tp6.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPGrammar().apply(this);
        outStart(node);
    }

    public void inAGrammar(AGrammar node)
    {
        defaultIn(node);
    }

    public void outAGrammar(AGrammar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGrammar(AGrammar node)
    {
        inAGrammar(node);
        {
            List<PBlock> copy = new ArrayList<PBlock>(node.getBlock());
            Collections.reverse(copy);
            for(PBlock e : copy)
            {
                e.apply(this);
            }
        }
        outAGrammar(node);
    }

    public void inABlock(ABlock node)
    {
        defaultIn(node);
    }

    public void outABlock(ABlock node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlock(ABlock node)
    {
        inABlock(node);
        if(node.getCbrace() != null)
        {
            node.getCbrace().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getObrace() != null)
        {
            node.getObrace().apply(this);
        }
        outABlock(node);
    }

    public void inAAssignmentStatement(AAssignmentStatement node)
    {
        defaultIn(node);
    }

    public void outAAssignmentStatement(AAssignmentStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentStatement(AAssignmentStatement node)
    {
        inAAssignmentStatement(node);
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        outAAssignmentStatement(node);
    }

    public void inAConditionalStatement(AConditionalStatement node)
    {
        defaultIn(node);
    }

    public void outAConditionalStatement(AConditionalStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConditionalStatement(AConditionalStatement node)
    {
        inAConditionalStatement(node);
        if(node.getConditional() != null)
        {
            node.getConditional().apply(this);
        }
        outAConditionalStatement(node);
    }

    public void inAPrintSStatement(APrintSStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintSStatement(APrintSStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintSStatement(APrintSStatement node)
    {
        inAPrintSStatement(node);
        if(node.getPrintS() != null)
        {
            node.getPrintS().apply(this);
        }
        outAPrintSStatement(node);
    }

    public void inAReadSStatement(AReadSStatement node)
    {
        defaultIn(node);
    }

    public void outAReadSStatement(AReadSStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadSStatement(AReadSStatement node)
    {
        inAReadSStatement(node);
        if(node.getReadS() != null)
        {
            node.getReadS().apply(this);
        }
        outAReadSStatement(node);
    }

    public void inAWhileSStatement(AWhileSStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileSStatement(AWhileSStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileSStatement(AWhileSStatement node)
    {
        inAWhileSStatement(node);
        if(node.getWhileS() != null)
        {
            node.getWhileS().apply(this);
        }
        outAWhileSStatement(node);
    }

    public void inABlockStatement(ABlockStatement node)
    {
        defaultIn(node);
    }

    public void outABlockStatement(ABlockStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockStatement(ABlockStatement node)
    {
        inABlockStatement(node);
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outABlockStatement(node);
    }

    public void inABinexpressionExpression(ABinexpressionExpression node)
    {
        defaultIn(node);
    }

    public void outABinexpressionExpression(ABinexpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABinexpressionExpression(ABinexpressionExpression node)
    {
        inABinexpressionExpression(node);
        if(node.getBinexpression() != null)
        {
            node.getBinexpression().apply(this);
        }
        outABinexpressionExpression(node);
    }

    public void inAUniexpressionExpression(AUniexpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAUniexpressionExpression(AUniexpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUniexpressionExpression(AUniexpressionExpression node)
    {
        inAUniexpressionExpression(node);
        if(node.getUniexpression() != null)
        {
            node.getUniexpression().apply(this);
        }
        outAUniexpressionExpression(node);
    }

    public void inAAssignment(AAssignment node)
    {
        defaultIn(node);
    }

    public void outAAssignment(AAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        inAAssignment(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getRhs() != null)
        {
            node.getRhs().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAssignment(node);
    }

    public void inAConditional(AConditional node)
    {
        defaultIn(node);
    }

    public void outAConditional(AConditional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConditional(AConditional node)
    {
        inAConditional(node);
        if(node.getElsepart() != null)
        {
            node.getElsepart().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getThenpart() != null)
        {
            node.getThenpart().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getCond() != null)
        {
            node.getCond().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        outAConditional(node);
    }

    public void inAPrintS(APrintS node)
    {
        defaultIn(node);
    }

    public void outAPrintS(APrintS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintS(APrintS node)
    {
        inAPrintS(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        outAPrintS(node);
    }

    public void inAReadS(AReadS node)
    {
        defaultIn(node);
    }

    public void outAReadS(AReadS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadS(AReadS node)
    {
        inAReadS(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        outAReadS(node);
    }

    public void inAWhileS(AWhileS node)
    {
        defaultIn(node);
    }

    public void outAWhileS(AWhileS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileS(AWhileS node)
    {
        inAWhileS(node);
        if(node.getBody() != null)
        {
            node.getBody().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getCond() != null)
        {
            node.getCond().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        outAWhileS(node);
    }

    public void inABinexpression(ABinexpression node)
    {
        defaultIn(node);
    }

    public void outABinexpression(ABinexpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABinexpression(ABinexpression node)
    {
        inABinexpression(node);
        if(node.getRExp() != null)
        {
            node.getRExp().apply(this);
        }
        if(node.getOperator() != null)
        {
            node.getOperator().apply(this);
        }
        if(node.getLExp() != null)
        {
            node.getLExp().apply(this);
        }
        outABinexpression(node);
    }

    public void inAOperatorarithOperator(AOperatorarithOperator node)
    {
        defaultIn(node);
    }

    public void outAOperatorarithOperator(AOperatorarithOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperatorarithOperator(AOperatorarithOperator node)
    {
        inAOperatorarithOperator(node);
        if(node.getOperatorarith() != null)
        {
            node.getOperatorarith().apply(this);
        }
        outAOperatorarithOperator(node);
    }

    public void inAOperatorlogiqueOperator(AOperatorlogiqueOperator node)
    {
        defaultIn(node);
    }

    public void outAOperatorlogiqueOperator(AOperatorlogiqueOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperatorlogiqueOperator(AOperatorlogiqueOperator node)
    {
        inAOperatorlogiqueOperator(node);
        if(node.getOperatorlogique() != null)
        {
            node.getOperatorlogique().apply(this);
        }
        outAOperatorlogiqueOperator(node);
    }

    public void inAPlusOperatorarith(APlusOperatorarith node)
    {
        defaultIn(node);
    }

    public void outAPlusOperatorarith(APlusOperatorarith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusOperatorarith(APlusOperatorarith node)
    {
        inAPlusOperatorarith(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusOperatorarith(node);
    }

    public void inAMinusOperatorarith(AMinusOperatorarith node)
    {
        defaultIn(node);
    }

    public void outAMinusOperatorarith(AMinusOperatorarith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusOperatorarith(AMinusOperatorarith node)
    {
        inAMinusOperatorarith(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusOperatorarith(node);
    }

    public void inAMultiplierOperatorarith(AMultiplierOperatorarith node)
    {
        defaultIn(node);
    }

    public void outAMultiplierOperatorarith(AMultiplierOperatorarith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplierOperatorarith(AMultiplierOperatorarith node)
    {
        inAMultiplierOperatorarith(node);
        if(node.getMultiplier() != null)
        {
            node.getMultiplier().apply(this);
        }
        outAMultiplierOperatorarith(node);
    }

    public void inAModuloOperatorarith(AModuloOperatorarith node)
    {
        defaultIn(node);
    }

    public void outAModuloOperatorarith(AModuloOperatorarith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModuloOperatorarith(AModuloOperatorarith node)
    {
        inAModuloOperatorarith(node);
        if(node.getModulo() != null)
        {
            node.getModulo().apply(this);
        }
        outAModuloOperatorarith(node);
    }

    public void inADiviserOperatorarith(ADiviserOperatorarith node)
    {
        defaultIn(node);
    }

    public void outADiviserOperatorarith(ADiviserOperatorarith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiviserOperatorarith(ADiviserOperatorarith node)
    {
        inADiviserOperatorarith(node);
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        outADiviserOperatorarith(node);
    }

    public void inASupOperatorlogique(ASupOperatorlogique node)
    {
        defaultIn(node);
    }

    public void outASupOperatorlogique(ASupOperatorlogique node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASupOperatorlogique(ASupOperatorlogique node)
    {
        inASupOperatorlogique(node);
        if(node.getSup() != null)
        {
            node.getSup().apply(this);
        }
        outASupOperatorlogique(node);
    }

    public void inAInfOperatorlogique(AInfOperatorlogique node)
    {
        defaultIn(node);
    }

    public void outAInfOperatorlogique(AInfOperatorlogique node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInfOperatorlogique(AInfOperatorlogique node)
    {
        inAInfOperatorlogique(node);
        if(node.getInf() != null)
        {
            node.getInf().apply(this);
        }
        outAInfOperatorlogique(node);
    }

    public void inAEqualOperatorlogique(AEqualOperatorlogique node)
    {
        defaultIn(node);
    }

    public void outAEqualOperatorlogique(AEqualOperatorlogique node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualOperatorlogique(AEqualOperatorlogique node)
    {
        inAEqualOperatorlogique(node);
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        outAEqualOperatorlogique(node);
    }

    public void inAIntegervalueUniexpression(AIntegervalueUniexpression node)
    {
        defaultIn(node);
    }

    public void outAIntegervalueUniexpression(AIntegervalueUniexpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegervalueUniexpression(AIntegervalueUniexpression node)
    {
        inAIntegervalueUniexpression(node);
        if(node.getIntegervalue() != null)
        {
            node.getIntegervalue().apply(this);
        }
        outAIntegervalueUniexpression(node);
    }

    public void inAVariablerefUniexpression(AVariablerefUniexpression node)
    {
        defaultIn(node);
    }

    public void outAVariablerefUniexpression(AVariablerefUniexpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariablerefUniexpression(AVariablerefUniexpression node)
    {
        inAVariablerefUniexpression(node);
        if(node.getVariableref() != null)
        {
            node.getVariableref().apply(this);
        }
        outAVariablerefUniexpression(node);
    }

    public void inAIntegervalue(AIntegervalue node)
    {
        defaultIn(node);
    }

    public void outAIntegervalue(AIntegervalue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegervalue(AIntegervalue node)
    {
        inAIntegervalue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAIntegervalue(node);
    }

    public void inAVariableref(AVariableref node)
    {
        defaultIn(node);
    }

    public void outAVariableref(AVariableref node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableref(AVariableref node)
    {
        inAVariableref(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVariableref(node);
    }
}
