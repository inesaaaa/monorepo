const { test, expect } = require('@jest/globals');
const greet = (name) => `Hello, ${name}!`;

test('greet function', () => {
    expect(greet('World')).toBe('Hello, World!');
});
