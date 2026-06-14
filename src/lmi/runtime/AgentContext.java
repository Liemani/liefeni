package lmi.runtime;

import java.util.Stack;
import haven.Coord;

public class AgentContext {
    private final Stack<Coord> moveHistory = new Stack<>();

    public void pushBreadcrumb(Coord pos) {
        moveHistory.push(Coord.of(pos));
    }

    public Coord popBreadcrumb() {
        return moveHistory.isEmpty() ? null : moveHistory.pop();
    }

    public boolean hasBreadcrumbs() {
        return !moveHistory.isEmpty();
    }
}
