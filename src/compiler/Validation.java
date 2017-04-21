package compiler;

/**
 * Created by jebjohnson on 4/20/17.
 */
public class Validation {


    private int line_counter;

    /*
    =============================================================
    =============================================================
    */

    private boolean is_newline(String token){

        boolean flag = false;

        if (token.equals(GrammarDefs.NEW_LINE)) {

            flag = true;
            line_counter += 1;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_identifier(String token){

        boolean flag = false;

        if (token.equals(GrammarDefs.IDENTIFIER)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_number(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.WHOLE_NUMBER)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_open_bracket(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.OPEN_BRACKET)) {

            flag = true;

        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_closed_brackets(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.CLOSE_BRACKET)) {

            flag = true;
        }
        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_label(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.LABEL)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_assignment(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.ASSIGNMENT)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_assignment_val(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.ASSIGNMENT_VAL)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_if(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.IF)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_loop(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.LOOP)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_print(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.PRINT)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_and_token(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.AND_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_or_token(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.OR_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_not_equal_token(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.NOT_EQUAL_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_true_token(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.TRUE_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_false_token(String token) {

        boolean flag = false;

        if (token.equals(GrammarDefs.FALSE_TOKEN)) {

            flag = true;
        }
        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_equals_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.EQUALS_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_gt_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.GT_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_gte_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.GTE_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_lt_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.LT_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_lte_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.LTE_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_add_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.ADD_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_sub_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.SUB_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_multi_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.MULTI_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_div_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.DIV_TOKEN)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_mod_token(String token) {

        boolean flag = false;

        if(token.equals(GrammarDefs.MOD_TOKEN)) {

            flag = true;
        }

        return flag;
    }


    /*
    =============================================================
    Determines if an array is a valid mathematical expression
    =============================================================
    */

    private boolean is_expression_token(String[] token) {

        boolean flag = true;
        String prev_token = token[0];
        int i = 1;

        //checks expression for invalid combinations
       while (flag && i < token.length) {

           if (is_numerical_token(prev_token) && !is_operation(token[i])){

               flag = false;

           } else if (is_operation(prev_token) && !is_numerical_token(token[i])) {

               flag = false;

           }
           
           prev_token = token[i];
           i++;
       }
        
       //checks expression does not start or end with an operator
        if (flag && (!is_numerical_token(token[0]) || !is_numerical_token(token[token.length]))) {

            flag = false;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_numerical_token(String token) {

        boolean flag = false;

        if(is_number(token) || is_identifier(token)) {

            flag = true;
        }

        return flag;
    }

    /*
    =============================================================
    =============================================================
    */

    private boolean is_operation(String token) {

        boolean flag = false;

        switch (token) {

            case GrammarDefs.ADD_TOKEN:
                flag = true;
                break;

            case GrammarDefs.SUB_TOKEN:
                flag = true;
                break;

            case GrammarDefs.DIV_TOKEN:
                flag = true;
                break;

            case GrammarDefs.MULTI_TOKEN:
                flag = true;
                break;

            case GrammarDefs.MOD_TOKEN:
                flag = true;
                break;
                
            default:
                break;
        }
        return flag;
    }
}






















