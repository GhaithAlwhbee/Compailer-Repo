package SemanticAnalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {

    Stack<Map<String, Symbol>> stack;

    /*
    The key in the hash table is the name of the identifier,
    and the value is a record containing information about the symbol such as its type, scope, and memory location.
     */
    int currentScope;

    public SymbolTable() {
        stack = new Stack<>();
        currentScope = 0;
        // push the first hash table onto the stack to represent the global scope
        stack.push(new HashMap<>());
    }

    public void enterScope() {
        // increment the current scope
        currentScope++;
        // push a new hash table onto the stack to represent the new scope
        stack.push(new HashMap<>());
    }

    public void exitScope() {
        // pop the hash table representing the current scope from the stack
        stack.pop();
        // decrement the current scope
        currentScope--;
    }

    public void insert(String name, String type,String kind) {
        // create a new symbol with the given name, type, and current scope
        Symbol symbol = new Symbol(name, type, kind, currentScope);
        // insert the symbol into the hash table representing the current scope
        stack.peek().put(name, symbol);
    }

    public Symbol lookup(String name) {
        // search for the symbol in all hash tables on the stack (from top to bottom)
        for (int i = stack.size() - 1; i >= 0; i--) {
            Map<String, Symbol> table = stack.get(i);
            if (table.containsKey(name)) {
                return table.get(name);
            }
        }
        // symbol not found
        return null;
    }

}
