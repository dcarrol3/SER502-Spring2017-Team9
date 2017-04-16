/*
 * Purpose: Generates intermediate code from the parsed high level code.
 * Author(s): Doug Carroll
 * Version: 1
 * Date: 4/15/2017
 */

package compiler;


import runtime.Constants;
import java.util.ArrayList;

public class IntermediateGenerator {
    public final String INTER_CODE_DIR = "data/";

    // Generate intermediate code from parsed code
    public void generateCode(ArrayList<Operation> operations, String filename){
        StringBuilder intermCode = new StringBuilder("");
        for(Operation operation : operations){
            String assemblyOp = "";
            switch(operation.getType()){
                case ASSIGNMENT:
                    assemblyOp = assignmentOp(operation.getVariable(), operation.getValue1());
                    break;
                case IF:
                case LOOP:
                case ADDITION:
                    assemblyOp = addOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case SUBTRACTION:
                    assemblyOp = subOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case MULTIPLICATION:
                    assemblyOp = multiOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case DIVISION:
                    assemblyOp = divOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case MODULUS:
                    assemblyOp = modOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case EQUAL_TO:
                    assemblyOp = equalsOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case NOT_EQUAL_TO:
                    assemblyOp = notEqualsOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case GREATER_THAN:
                    assemblyOp = gtOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case LESS_THAN:
                    assemblyOp = ltOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case GREATER_THAN_EQUAL_TO:
                    assemblyOp = gteOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case LESS_THAN_EQUAL_TO:
                    assemblyOp = lteOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case TRUE: // TODO - Is this an operation?
                case FALSE: // TODO - Is this an operation?
                case AND:
                    assemblyOp = andOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case OR:
                    assemblyOp = orOp(operation.getVariable(), operation.getValue1(), operation.getValue2());
                    break;
                case PRINT:
                    assemblyOp = printOp(operation.getVariable());
                    break;
                case JUMP:
                    assemblyOp = jumpOp(operation.getVariable(), operation.getValue1());
                    break;
                default:
            }
            intermCode.append(assemblyOp);
            intermCode.append("\n"); // Every operation must be on a new line
        }
        FileHandler.stringToFile(INTER_CODE_DIR + filename, intermCode.toString());
    }

    private String assignmentOp(String variable, String value){
        return Constants.ADD + "," + variable + ",0," + value;
    }

    private String addOp(String variable, String value1, String value2){
        return Constants.ADD + "," + variable + "," + value1 + "," + value2;
    }

    private String subOp(String variable, String value1, String value2){
        return Constants.SUBTRACT + "," + variable + "," + value1 + "," + value2;
    }

    private String multiOp(String variable, String value1, String value2){
        return Constants.MULTIPLY + "," + variable + "," + value1 + "," + value2;
    }

    private String divOp(String variable, String value1, String value2){
        return Constants.DIVIDE + "," + variable + "," + value1 + "," + value2;
    }

    private String modOp(String variable, String value1, String value2){
        return Constants.MODULUS + "," + variable + "," + value1 + "," + value2;
    }

    private String equalsOp(String variable, String value1, String value2){
        return Constants.EQUALS + "," + variable + "," + value1 + "," + value2;
    }

    private String notEqualsOp(String variable, String value1, String value2){
        return Constants.NOT_EQUAL + "," + variable + "," + value1 + "," + value2;
    }

    private String gtOp(String variable, String value1, String value2){
        return Constants.GREATER_THAN + "," + variable + "," + value1 + "," + value2;
    }

    private String ltOp(String variable, String value1, String value2){
        return Constants.LESS_THAN + "," + variable + "," + value1 + "," + value2;
    }

    private String gteOp(String variable, String value1, String value2){
        return Constants.GREATER_THAN_EQUAL_TO + "," + variable + "," + value1 + "," + value2;
    }

    private String lteOp(String variable, String value1, String value2){
        return Constants.LESS_THAN_EQUAL_TO + "," + variable + "," + value1 + "," + value2;
    }

    private String andOp(String variable, String value1, String value2){
        return Constants.AND + "," + variable + "," + value1 + "," + value2;
    }

    private String orOp(String variable, String value1, String value2){
        return Constants.OR + "," + variable + "," + value1 + "," + value2;
    }

    private String printOp(String variable){
        return Constants.PRINT + "," + variable;
    }

    private String jumpOp(String variable, String label){
        return Constants.JUMP + "," + variable + "," + label;
    }
}
