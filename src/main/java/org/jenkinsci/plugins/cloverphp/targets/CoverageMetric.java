package org.jenkinsci.plugins.cloverphp.targets;

/**
 * Created by IntelliJ IDEA.
 *
 * @author connollys
 * @since 10-Jul-2007 14:59:50
 */
public enum CoverageMetric {

    METHOD("Methods"),
    STATEMENT("Statements"),
    ELEMENT("Elements");

    private String name;

    CoverageMetric(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
