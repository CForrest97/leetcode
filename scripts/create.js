const { mkdirSync, writeFileSync } = require("fs");
const path = require("path");

const kebabToCamel = (kebab) =>
  kebab
    .split("-")
    .map((word) => word.charAt(0).toUpperCase() + word.slice(1))
    .join("");

const createFiles = (problemNumber, camelName) => {
  const baseDir = path.join(
    "leetcode-solutions",
    "src",
    "main",
    "java",
    "com",
    "example",
    `p${problemNumber.padStart(4, "0")}${camelName}`
  );
  const testDir = path.join(
    "leetcode-solutions",
    "src",
    "test",
    "java",
    "com",
    "example",
    `p${problemNumber.padStart(4, "0")}${camelName}`
  );

  const solutionTemplate = `package com.example.p${problemNumber.padStart(
    4,
    "0"
  )}${camelName};

public class Solution {
    public void exampleMethod() {
        // TODO: Implement the solution
    }
}
`;

  const testTemplate = `package com.example.p${problemNumber.padStart(
    4,
    "0"
  )}${camelName};

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(true, solution.exampleMethod(121));
    }
}
`;

  mkdirSync(baseDir, { recursive: true });
  mkdirSync(testDir, { recursive: true });

  writeFileSync(path.join(baseDir, "Solution.java"), solutionTemplate);
  writeFileSync(path.join(testDir, "SolutionTest.java"), testTemplate);

  console.log(
    `Files created successfully for problem ${problemNumber} with name '${camelName}'`
  );
};

if (process.argv.length === 3) {
  const [problemNumber, ...nameParts] = process.argv[2].split(".");
  const name = nameParts.join(".").trim();

  const camelCaseName = name
    .toLowerCase()
    .replace(/(?:^\w|[A-Z]|\b\w|\s+)/g, (match) => match.toUpperCase())
    .replace(/\s+/g, "");

  const formattedName = camelCaseName;

  createFiles(problemNumber.trim(), formattedName);
} else {
  const [, , problemNumber, kebabName] = process.argv;

  if (!problemNumber || !kebabName) {
    console.log("Usage: node create.js <problem_number> <kebab_case_name>");
    process.exit(1);
  }

  createFiles(problemNumber, kebabToCamel(kebabName));
}
